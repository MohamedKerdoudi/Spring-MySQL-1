<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Créer un véhicule</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h1>Créer un véhicule</h1>

    <form method="post" action="/saveVehicule" class="needs-validation" novalidate>
        <div class="form-group">
            <label for="id">ID</label>
            <input type="text" class="form-control" id="id" name="id" required>
            <div class="invalid-feedback">
                Veuillez entrer l'ID du véhicule.
            </div>
        </div>

        <div class="form-group">
            <label for="marque">Marque</label>
            <input type="text" class="form-control" id="marque" name="marque" required>
            <div class="invalid-feedback">
                Veuillez entrer la marque du véhicule.
            </div>
        </div>

        <div class="form-group">
            <label for="modele">Modèle</label>
            <input type="text" class="form-control" id="modele" name="modele" required>
            <div class="invalid-feedback">
                Veuillez entrer le modèle du véhicule.
            </div>
        </div>

        <div class="form-group">
            <label for="couleur">Couleur</label>
            <input type="text" class="form-control" id="couleur" name="couleur" required>
            <div class="invalid-feedback">
                Veuillez entrer la couleur du véhicule.
            </div>
        </div>

        <button type="submit" class="btn btn-primary">Enregistrer</button>
    </form>
</div>

<script>
    // Activation de la validation des formulaires HTML5
    (function() {
        'use strict';
        window.addEventListener('load', function() {
            var forms = document.getElementsByClassName('needs-validation');
            var validation = Array.prototype.filter.call(forms, function(form) {
                form.addEventListener('submit', function(event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    })();
</script>

</body>
</html>
