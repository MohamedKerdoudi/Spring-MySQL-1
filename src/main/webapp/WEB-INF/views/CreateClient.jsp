<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Création d'un client</title>
</head>
<body>
    <h1>Création d'un client</h1>
    <form action="/clients" method="post">
        <label for="id">ID :</label>
        <input type="text" id="id" name="id" required><br><br>

        <label for="name">Nom :</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="licenseplate">Plaque d'immatriculation :</label>
        <input type="text" id="licenseplate" name="licenseplate" required><br><br>

        <label for="carte_bancaire">Carte bancaire :</label>
        <input type="text" id="carte_bancaire" name="carte_bancaire" required><br><br>

        <input type="submit" value="Créer">
        <a href="CLientList">Client List</a>
    </form>
</body>
</html>
