<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Payment Method</title>
</head>
<body>
    <h1>Payment Method</h1>

    <h3>Select a payment method:</h3>

    <form action="/processPayment" method="POST">
        <input type="radio" name="paymentMethod" value="Credit Card" checked> Credit Card<br>
        <input type="radio" name="paymentMethod" value="Debit Card"> Debit Card<br>
        <input type="radio" name="paymentMethod" value="Cash"> Cash<br><br>

        <input type="submit" value="Submit" />
    </form>

    <br>
    <a href="/ParkingList">Back to Parking List</a>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
