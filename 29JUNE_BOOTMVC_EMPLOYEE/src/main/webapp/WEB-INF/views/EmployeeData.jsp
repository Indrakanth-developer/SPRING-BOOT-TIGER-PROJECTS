<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<thead>
<tr>
<th>ID</th>
<th>NAME</th>
<th>SAL</th>
</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="obj">
<tr>
<td><c:out value="${obj.eid}"></c:out></td>
<td><c:out value="${obj.ename}"></c:out></td>
<td><c:out value="${obj.esal}"></c:out></td>
<td><a href="edit?id=${obj.eid}">EDIT</a></td>
<td><a href="delete?id=${obj.eid}">DELETE</a></td>
<td><a href="view?id=${obj.eid}">VIEW</a></td>
</tr>

</c:forEach>

</tbody>
</table>
</body>
</html>