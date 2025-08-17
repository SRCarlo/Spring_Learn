<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
<form action="/updatedata">
	<h2>
		<center>Update Employee </center>
	</h2>
	<h3>
		Enter Employee Id (to update employee data) : <input type="text" name="eid"><br> <br>
		Enter Employee Name (to update employee data) : <input type="text" name="ename"><br> <br>
		Enter Employee Salary (to update employee data) : <input type="text" name="esal"><br> <br>
		 <input type="submit" value="Update Employee">
	</h3>
</form>
</body>
</html>