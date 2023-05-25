<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Créer une facture</title>
</head>
<body>
    <h1>Créer une facture</h1>

    <form action="/createFacture" method="post">
        <label for="nom">Nom du client:</label>
        <input type="text" id="nom" name="nom" required><br><br>

        <label for="montant">Montant:</label>
        <input type="number" id="montant" name="montant" required><br><br>

        <label for="date">Date:</label>
        <input type="date" id="date" name="date" value="${now}" required><br><br>

        <input type="submit" value="Créer la facture">
    </form>
</body>
</html>
