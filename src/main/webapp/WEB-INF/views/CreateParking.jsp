
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>Création d'un parking</title>
</head>
<body>
    <h1>Création d'un parking</h1>

    <form action="/parking/create" method="post">
            <label for="id">ID :</label>
            <input type="text" id="id" name="id" required><br><br>


        <label for="availableSpaces">Places disponibles:</label>
        <input type="number" id="availableSpaces" name="availableSpaces" required><br><br>

        <label for="pricePerHour">Prix par heure:</label>
        <input type="number" id="pricePerHour" name="pricePerHour" step="0.01" required><br><br>

        <input type="submit" value="Créer">
    </form>
</body>
</html>
