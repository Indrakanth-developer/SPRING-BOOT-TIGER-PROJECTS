<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="save" method="POST" modelAttribute="employee">

<pre>

ID: <form:input path="eid"/>
NAME: <form:input path="ename"/>
SAL: <form:input path="esal"/>
<input type="submit" value="Register">
</pre>
</form:form>
</body>
</html>