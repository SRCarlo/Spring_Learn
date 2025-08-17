<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<h2>Product Management System</h2>
<h2 style="align-items: center;">
<a href="./login.jsp">Login</a> | <a href="./product.jsp">Product</a> |
<a href="./service.jsp">Service</a> | <a href="./help.jsp">Help</a>
</h2>
<h2 style="text-align: center;">Add Product</h2>
<form action="./msg">
Enter Product Id: <input type="number" placeholder="Enter product id"><br>
Enter Product Name: <input type="text" placeholder="Enter product name"><br>
Enter Product Price: <input type="number" placeholder="Enter product price"><br>
Enter Product Quantity: <input type="number" placeholder="Enter product quantity"><br>
</form>
</body>
</html>