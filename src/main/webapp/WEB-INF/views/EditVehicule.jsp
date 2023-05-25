<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Vehicule</title>
</head>
<body>
    <h1>Edit Vehicule</h1>

    <form action="/updateVehicule" method="POST">
        <input type="hidden" name="id" value="${vehicule.id}" />

        <label for="plateNumber">Plate Number:</label>
        <input type="text" name="plateNumber" value="${vehicule.plateNumber}" /><br><br>

        <label for="brand">Brand:</label>
        <input type="text" name="brand" value="${vehicule.brand}" /><br><br>

        <label for="color">Color:</label>
        <input type="text" name="color" value="${vehicule.color}" /><br><br>

        <input type="submit" value="Update" />
    </form>

    <br>
    <a href="/VehiculeList">Back to Vehicule List</a>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
