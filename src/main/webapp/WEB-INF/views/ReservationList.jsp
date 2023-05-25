<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reservation List</title>
</head>
<body>
    <h1>Reservation List</h1>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Vehicle</th>
            <th>Duration</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${reservations}" var="reservation">
            <tr>
                <td>${reservation.id}</td>
                <td>${reservation.name}</td>
                <td>${reservation.vehicle.plateNumber}</td>
                <td>${reservation.duration} hours</td>
                <td>
                    <a href="/EditReservation?id=${reservation.id}">Edit</a> |
                    <a href="/DeleteReservation?id=${reservation.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <br>
    <a href="/CreateReservation">Create New Reservation</a>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
