<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="com.hl.demo1.*"%>
<%
	Boss boss = new Boss();
 	Car car = boss.getCar();
 	if(car!=null){
 		car.getBrand();
 	}else{
 		System.out.println(".....");
 	}
%>
<!DOCTYPE>
<html>
<head>
<title>http://localhost:8080/GitHubLiaoliao/index.jsp</title>
<link rel="stylesheet" type="text/css" href="ext/ext4/resources/css/ext-all.css">
<script type="text/javascript" src="ext/ext4/bootstrap.js"></script>
<script type="text/javascript" src="ext/ext4/locale/ext-lang-zh_CN.js"></script>
<script type="text/javascript" src="index.js"></script>
</head>
<body>
</body>
</html>
