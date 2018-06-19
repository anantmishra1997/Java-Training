<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<s:head/>
<br><br>
	<center><h2><u>Please Login</u></h2></center>
<s:form action="doLogin">
<table>
<tr>
<td><s:textfield name="useName" label="User Name"/>
</td></tr>
<tr>
<td><s:submit align="center" value="login"/>
</td></tr>
</table>
</s:form>
</body>
</html>