<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="java.io.*"%>
<%@ page import="jxl.*"%>
<%@ page import="jxl.format.*"%>
<%@ page import="jxl.write.WritableCellFormat"%>
<%@ page import="jxl.write.WritableFont"%>
<%@ page import="jxl.write.WritableSheet"%>
<%@ page import="jxl.write.WritableWorkbook"%>
<%@ page import="jxl.write.Label"%>
<%@ page import="jxl.write.Number"%>
<%@ page import="jxl.write.WritableCell"%>
 
<%
  
 	 
	response.reset();
 	response.setContentType("APPLICATION/OCTET-STREAM");
 
	response.setHeader("Content-Disposition", 
		"filename="  + new String("-fileName-出货通知单.xls".getBytes("gb2312"),
		"ISO8859_1"));
	
	String BOLD = "BOLD";
	String NOBOLD = "NOBOLD";
	BufferedOutputStream os = new BufferedOutputStream(response.getOutputStream());
	WritableWorkbook wwb = Workbook.createWorkbook(os);
	WritableSheet sheet = wwb.createSheet("--出货通知单", 0);
	WritableCell cell = null;
 
    WritableCellFormat format=getFormat(BOLD,10,Colour.BLACK);
    format.setBorder(Border.ALL,BorderLineStyle.getStyle(1));
    
    WritableCellFormat format1=getFormat(NOBOLD,10,Colour.BLACK);
    format1.setBorder(Border.ALL,BorderLineStyle.getStyle(1));
    
    WritableCellFormat format2=getFormat(NOBOLD,10,Colour.RED);
    format2.setBorder(Border.ALL,BorderLineStyle.getStyle(1));

    sheet.setColumnView(0,5);
    sheet.setColumnView(1,5);
    sheet.setColumnView(2,17);
    sheet.setColumnView(3,25);
    sheet.setColumnView(4,20);
    sheet.setColumnView(5,5);
    sheet.setColumnView(6,10);
    sheet.setColumnView(7,30);
    
    int rowcut =0;
    
    cell = new Label(0, rowcut, "位置",format);
    sheet.addCell(cell);
    cell = new Label(1, rowcut, "层",format);
    sheet.addCell(cell);
    cell = new Label(2, rowcut, "物料代码",format);
    sheet.addCell(cell);
    cell = new Label(3, rowcut, "物料名称",format);
    sheet.addCell(cell);
    cell = new Label(4, rowcut, "代号",format);
    sheet.addCell(cell);
    cell = new Label(5, rowcut, "数量",format);
    sheet.addCell(cell);
    cell = new Label(6, rowcut, "单位",format);
    sheet.addCell(cell);
    cell = new Label(7, rowcut, "物料组",format);
    sheet.addCell(cell);
    rowcut++;
    
	try { } catch (Exception e) {
		e.printStackTrace();
	} finally { }
	wwb.write();
	wwb.close();
	os.close();

%>


<%!
  private static WritableCellFormat getFormat(String style, int size, Colour color){
    String BOLD = "BOLD";
    String NOBOLD = "NOBOLD";
        WritableFont wfc = null;
        if(BOLD.equals(style))
            wfc = new WritableFont(WritableFont.ARIAL, size, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
        else
        if(NOBOLD.equals(style))
            wfc = new WritableFont(WritableFont.ARIAL, size, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
        return new WritableCellFormat(wfc);
    }
    %>
<%!

  private static WritableCellFormat getFormat1(String style, int size, Colour color){
    String BOLD = "BOLD";
    String NOBOLD = "NOBOLD";
        WritableFont wfc = null;
        if(BOLD.equals(style))
            wfc = new WritableFont(WritableFont.ARIAL, size, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.RED);
        else
        if(NOBOLD.equals(style))
            wfc = new WritableFont(WritableFont.ARIAL, size, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.RED);
        return new WritableCellFormat(wfc);
    }
%>
