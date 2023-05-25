<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Création d'un tarif</title>
</head>
<body>
    <h1>Création d'un tarif</h1>
    <form action="/saveTarif" method="post">
        <label for="prix1heure">Prix pour 1 heure:</label>
        <input type="text" id="prix1heure" name="prix1heure"><br>
        <label for="prix2heures">Prix pour 2 heures:</label>
        <input type="text" id="prix2heures" name="prix2heures"><br>
        <input type="submit" value="Enregistrer">
    </form>
</body>
</html>