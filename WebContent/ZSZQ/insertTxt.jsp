<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import = "java.io.InputStreamReader" %>
<%@ page import = "java.io.BufferedReader" %>

<%
	System.out.println("ddd");
	try{
		InputStreamReader read = new InputStreamReader(request.getInputStream(),"GBK");
		BufferedReader bufferedReader = new BufferedReader(read);
        String lineTxt = null;
        while((lineTxt = bufferedReader.readLine()) != null){
        	System.out.println(lineTxt);
        }
	}catch(Exception e){
		e.printStackTrace();
	}
	
%>