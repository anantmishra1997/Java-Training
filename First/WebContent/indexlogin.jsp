<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<s:actionerror/>
<s:actionmessage/>
Welcome,<s:property value="#session['User1'].username" default="Guest"/> !
<br><br>
<s:url id="addemp" action="addEmployee"/>
<s:a href="%{addemp}">Add Employee</s:a><br><br>
<s:set name="user" value="#session['User1']"/>
<s:if test="%{#user==null}">
<s:a href ="loginlogin.jsp">Login</s:a>
</s:if>
<s:else>
<s:url id="logout" action="logoutAction"/>
<s:a href="%{logout}">Logout</s:a></s:else>
</body>
</html>