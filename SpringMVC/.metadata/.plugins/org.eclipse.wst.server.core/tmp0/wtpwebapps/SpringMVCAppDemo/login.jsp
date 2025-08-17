<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
	<p>${msg}</p>
	<h1>
		<center>Login Page</center>
	</h1>
	<form action="./index" method="post">
		Username: <input type="text" size="20" name="uname"><br>
		<br> Password:<input type="text" size="20" name="upwd"><br>
		<br> <input type="submit" value="login"><br> <br>
	</form>
</body>
</html>