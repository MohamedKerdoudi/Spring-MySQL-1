<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Tarif</title>
</head>
<body>
    <h1>Edit Tarif</h1>

    <form action="/updateTarif" method="POST">
        <input type="hidden" name="id" value="${tarif.id}" />

        <label for="pricePerHour">Price per Hour:</label>
        <input type="number" name="pricePerHour" value="${tarif.pricePerHour}" step="0.01" required /><br><br>

        <input type="submit" value="Save" />
    </form>

    <br>
    <a href="/TarifList">Back to Tarif List</a>
</body>
</html>
