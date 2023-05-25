<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Réservation</title>
</head>
<body>
    <h1>Réservation</h1>
    <form action="/saveReservation" method="post">
        <label for="clientId">ID du client:</label>
        <input type="text" id="clientId" name="clientId" required><br>
        <label for="parkingId">ID du parking:</label>
        <input type="text" id="parkingId" name="parkingId" required><br>
        <label for="dateDebut">Date de début:</label>
        <input type="text" id="dateDebut" name="dateDebut" required><br>
        <label for="dateFin">Date de fin:</label>
        <input type="text" id="dateFin" name="dateFin" required><br>
        <input type="submit" value="Enregistrer">
    </form>
</body>
</html>