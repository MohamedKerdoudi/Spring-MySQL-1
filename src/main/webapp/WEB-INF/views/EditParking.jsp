<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Parking</title>
</head>
<body>
    <h1>Edit Parking</h1>

    <form action="/updateParking" method="POST">
        <input type="hidden" name="id" value="${parking.id}" />

        <label for="availableSpaces">Available Spaces:</label>
        <input type="number" name="availableSpaces" value="${parking.availableSpaces}" /><br><br>

        <label for="pricePerHour">Price per Hour:</label>
        <input type="number" name="pricePerHour" value="${parking.pricePerHour}" /><br><br>

        <input type="submit" value="Update" />
    </form>

    <br>
    <a href="/ParkingList">Back to Parking List</a>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
