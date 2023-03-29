<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h1>Hello World! from spring</h1>

	<%
	out.println(request.getAttribute("id") + "</br>");
	out.println(request.getAttribute("Name") + "<br>");
	out.println(request.getAttribute("Salary") + "<br>");
	%>

	<p>${id}</p>

</body>
</html>
