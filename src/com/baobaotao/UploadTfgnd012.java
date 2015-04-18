package com.baobaotao;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
 

public class UploadTfgnd012 extends HttpServlet {
 
	private static final long serialVersionUID = 8677605424067580256L;

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
 
		 
		PrintWriter out = res.getWriter();
	  
		final int NONE = 0;
		final int DATAHEADER = 1;
		final int FILEDATA = 2;
		final int FIELDDATA = 3;
		int totalbytes = req.getContentLength();
		byte[] b = new byte[totalbytes];
		String contentType = req.getContentType();
		String fieldname = "";
		String fieldvalue = "";
		String filename = "";
		String boundary = "";
		String lastboundary = "";
 
		int pos = contentType.indexOf("boundary=");
		if (pos != -1) {
			pos += "boundary=".length();
			boundary = "--" + contentType.substring(pos);
			lastboundary = boundary + "--";
		}
		int state = NONE;
		DataInputStream in = new DataInputStream(req.getInputStream());
		in.readFully(b);
		in.close();
		String reqcontent = new String(b);
		BufferedReader reqbuf = new BufferedReader(new StringReader(reqcontent));
		boolean flag = true;
		int i = 0;
 
		while (flag == true) {
			String s = reqbuf.readLine();
			if (s == lastboundary || s == null)
				break;
			switch (state) {
			case NONE:
				if (s.startsWith(boundary)) {
					state = DATAHEADER;
					i += 1;
				}
				break;
			case DATAHEADER:
				pos = s.indexOf("filename=");
				if (pos == -1) {
					pos = s.indexOf("name=");
					pos += "name=".length() + 1;
					s = s.substring(pos);
					int l = s.length();
					s = s.substring(0, l - 1);
					fieldname = s;
					state = FIELDDATA;
				} else {
					String temp = s;
					pos = s.indexOf("filename=");
	 
					pos += "filename=".length() + 1;
			 
					s = s.substring(pos);
		 
					int l = s.length();
					s = s.substring(0, l - 1);
	 
					pos = s.lastIndexOf("\\");
				 
					s = s.substring(pos + 1);
					s.indexOf("\\");
			 
				 
				 
					filename = s;
					
					System.out.println("上传的Excel名称："+filename);
		  
				 
					if (filename.length() == 0) {
						out.println("<script language=\"javascript\">");
						out.println("alert('上传数据错误');");
						out.println("window.history.back();");
						out.println("</script>");
					} else {
						pos = byteIndexOf(b, temp, 0);   
						b = subBytes(b, pos + temp.getBytes().length + 2,
								b.length);
						s = reqbuf.readLine();
						filename = "b180121" + filename;
						File f = new File("d:\\" + filename);
						DataOutputStream fileout = new DataOutputStream(
								new FileOutputStream(f));
						b = subBytes(b, s.getBytes().length + 4, b.length);
						pos = byteIndexOf(b, boundary, 0);
						b = subBytes(b, 0, pos - 1);
						// System.out.println("data is: "+b);
						fileout.write(b, 0, b.length - 1);
						// fileSize = b.length - 1;
						state = FILEDATA;
						try {
 
							String fileNameLocation = "d:\\upload\\" + filename;
							Workbook wwb = Workbook.getWorkbook(new FileInputStream(fileNameLocation));
							Sheet sheet = wwb.getSheet(0);
							for (int j = 1; j < sheet.getRows(); j++) {
								Cell[] cells = sheet.getRow(j);
								if (cells.length >= 7) {
									String fpzl = cells[0].getContents().trim();
									String jskh = cells[1].getContents().trim();
									String yamt = cells[2].getContents().trim();
									String vtax = cells[3].getContents().trim();
									String kprq = cells[4].getContents().trim();
									String rzdt = cells[5].getContents().trim();
								}
							}
							 
 
						} catch (Exception e) {
							 
						} finally { }
					}
				}
				break;
			case FIELDDATA:
				s = reqbuf.readLine();
				fieldvalue = s;
				state = NONE;
				break;
			case FILEDATA:
				while ((!s.startsWith(boundary))
						&& (!s.startsWith(lastboundary))) {
					s = reqbuf.readLine();
					if (s.startsWith(boundary)) {
						state = DATAHEADER;
					} else
						break;
					break;
				}
			}
		}
 
	}

	private static int byteIndexOf(byte[] b, String s, int start) {
		return byteIndexOf(b, s.getBytes(), start);
	}

	private static int byteIndexOf(byte[] b, byte[] s, int start) {
		int i;
		if (s.length == 0) {
			return 0;
		}
		int max = b.length - s.length;
		if (max < 0)
			return -1;
		if (start > max)
			return -1;
		if (start < 0)
			start = 0;
		search: for (i = start; i < max; i++) {
			if (b[i] == s[0]) {
				int k = 1;
				while (k < s.length) {
					if (b[k + i] != s[k]) {
						continue search;
					}
					k++;
				}
				return i;
			}
		}
		return -1;
	}

	private static byte[] subBytes(byte[] b, int from, int end) {
		byte[] result = new byte[end - from];
		System.arraycopy(b, from, result, 0, end - from);
		return result;
	}

}
