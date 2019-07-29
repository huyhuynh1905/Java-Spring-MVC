<%@page import="com.huyhuynh.entity.NhanVien"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>${username}</h3>
	<%
		//Cach khac dung java (Chu yeu dung de xu li)
		String tendangnhap = (String) request.getAttribute("username");
	%>
	<h1><%= tendangnhap %></h1>
	
	<% 
		ArrayList<NhanVien> arnv = (ArrayList<NhanVien>) request.getAttribute("listnhanvien"); 
		for(NhanVien nv : arnv){
	%>
	<%= nv.getName() %> </br>
	<%} %>
</body>
</html>