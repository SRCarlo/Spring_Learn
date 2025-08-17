<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Spare Management</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<h1>Spare Management System</h1>
		<button class="btn btn-primary mt-3" onclick="loadSpares()">Load
			Spares</button>
		<div id="spares" class="mt-3">
			<!-- Spare data will be dynamically loaded here -->
		</div>
	</div>

	<script>
async function loadSpares() {
    const response = await fetch('/api/spares');
    const spares = await response.json();

    let table = `
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Stock</th>
                    <th>Added Date</th>
                </tr>
            </thead>
            <tbody>
    `;

    spares.forEach(spare => {
        table += `
            <tr>
                <td>${spare.id}</td>
                <td>${spare.name}</td>
                <td>${spare.price}</td>
                <td>${spare.stock}</td>
                <td>${spare.addedDate}</td>
            </tr>
        `;
    });

    table += '</tbody></table>';
    document.getElementById('spares').innerHTML = table;
}
</script>
</body>
</html>
