<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name<form:input path="firstName"/><br><br>
Last Name<form:input path="lastName"/><br><br>
Favourite Language:
Java<form:radiobutton path="favouriteLanguage" value="Java"/>
C<form:radiobutton path="favouriteLanguage" value="C"/>
C++<form:radiobutton path="favouriteLanguage" value="C++"/>
Python<form:radiobutton path="favouriteLanguage" value="Python"/><br><br>
Country:<form:select path="country">
<form:options items="${student.countryOptions}"/>
</form:select><br><br>
Operating System Comfortable with:
Linux<form:checkbox path="operatingSystems" value="Linux"/>
Windows<form:checkbox path="operatingSystems" value="Windows"/>
MacOS<form:checkbox path="operatingSystems" value="MacOS"/>
<br><br>
<input type="submit" value="submit">
</form:form>
</body>
</html>