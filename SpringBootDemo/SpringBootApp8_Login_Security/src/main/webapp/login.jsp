<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .navbar {
            background-color: #007bff;
        }
        .navbar a {
            color: white !important;
            font-size: 18px;
            margin: 0 10px;
        }
        .navbar a:hover {
            text-decoration: underline;
        }
        .login-container {
            max-width: 400px;
            margin: 80px auto;
            padding: 30px;
            background: white;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        .login-container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #007bff;
        }
        .btn-primary {
            width: 100%;
        }
    </style>
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Product Management System</a>
            <div class="navbar-nav">
                <a class="nav-link" href="./login.jsp">Login</a>
                <a class="nav-link" href="./product.jsp">Product</a>
                <a class="nav-link" href="./service.jsp">Service</a>
                <a class="nav-link" href="./help.jsp">Help</a>
            </div>
        </div>
    </nav>

    <!-- Login Form -->
    <div class="login-container">
        <h2>Login</h2>
        <form action="./login" method="post">
            <div class="mb-3">
                <label for="username" class="form-label">Enter Username</label>
                <input type="text" id="username" name="username" class="form-control" placeholder="Please enter your username" required>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Enter Password</label>
                <input type="password" id="password" name="password" class="form-control" placeholder="Please enter your password" required>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
