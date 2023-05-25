<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Reservation</title>
</head>
<body>
    <h1>Delete Reservation</h1>

    <form action="/deleteReservation" method="post">
        <input type="hidden" name="id" value="${reservation.id}">
        <p>Are you sure you want to delete the reservation with ID: ${reservation.id}?</p>
        <input type="submit" value="Delete">
    </form>

    <br>
    <a href="/ReservationList">Back to Reservation List</a>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
