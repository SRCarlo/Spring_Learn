<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
	<br>
	<h1>
		<center>Product List Page</center>
	</h1>
	<br>
	<center>
		<a href='./home.jsp'> Home </a>|<a href='./product.jsp'> Product </a>|<a
			href='./service.jsp'> Services </a>| <a href='./contact.jsp'>
			Contact us </a>|<a href='abt.jsp'> About us </a>
	</center>
	<br>
	<br> Product List is
	<br>
	<c:forEach items="${plist}" var="p">
		<table>
			<tr>
				<td>${p.pid}</td>
				<td>${p.pname}</td>
				<td>${p.pqty}</td>
				<td>${p.pprice}</td>
			</tr>
		</table>
	</c:forEach>
</body>
</html>