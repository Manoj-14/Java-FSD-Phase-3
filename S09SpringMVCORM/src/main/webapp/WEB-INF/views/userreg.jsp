<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>User Registration</h1>
	<form action="registeruser" method="post">
		Name: <input type="text" name="name" required="required" /> <br>
		Email: <input type="email" name="email" required="required" /> <br>
		Password: <input type="text" name="password" required="required" /> <br>
		<input type="submit" value="Sign Up" />
	</form>
	<h2>${message}</h2>
</body>
</html>