<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tarif List</title>
</head>
<body>
    <h1>Tarif List</h1>

    <table>
        <tr>
            <th>ID</th>
            <th>Price per Hour</th>
            <th>Edit</th>
        </tr>
        <c:forEach var="tarif" items="${TarifList}">
            <tr>
                <td>${tarif.id}</td>
                <td>${tarif.pricePerHour}</td>
                <td><a href="/EditTarif?id=${tarif.id}">Edit</a></td>
            </tr>
        </c:forEach>
    </table>

    <br>
    <a href="/CreateTarif">Add New Tarif</a>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
