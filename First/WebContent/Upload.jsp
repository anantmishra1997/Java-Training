<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload</title>
</head>
<body>
<s:form action="res" method="post" enctype="multipart/form-data">
<s:actionerror/>
<s:actionmessage/>
<s:file name="myFile" label="Image(Browser)"/>
<s:submit value="Submit"/>
</s:form>
</body>
</html>