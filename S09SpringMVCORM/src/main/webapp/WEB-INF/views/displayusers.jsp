<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
<body>
	<h2>List of Users</h2>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
		</tr>
		<c:forEach var="user" items="${users }">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>