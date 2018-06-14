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
<s:form action="addEmployee">
<s:textfield name="employeename" label="Employee Name"/>
<s:textfield name="department" label="Department"/>
<s:textfield name="company" label="Company"/>
<s:submit value="Add Employee"/>
</s:form>
<s:url id="logout" action="logoutAction"/>
<s:a href="%{logout}">|Logout|</s:a>
<s:a href="indexlogin.jsp">|Home|</s:a>
</body>
</html>