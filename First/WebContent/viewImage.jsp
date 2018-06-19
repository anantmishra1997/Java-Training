<%@page import="mypack.conn" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="java.sql.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Images</title>
</head>
<body>
<%
	conn c1=new conn();
	ResultSet rs=c1.s.executeQuery("select * from myimage");
	while(rs.next()){
%>
Image:<img src="data:image/jpeg;base64,<%= rs.getString("pic")%>" />
<br><br>
<%} %>
</body>
</html>