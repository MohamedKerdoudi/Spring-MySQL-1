<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Vehicule List</title>
    </head>
    <body>
        <header>
            <h1>Vehicule List</h1>
        </header>
        <main>
              <table >
                <tr>
                  <th>Id</th><th>Planque Immatriculation </th><th>marque</th><th>modele</th> <th>Annee </th>
                </tr>
                <c:forEach items="${vehiculeList}" var="vehicule">
                            <tr>
                                <td>${vehicule.id}</td>
                                <td>${vehicule.immatriculation}</td>
                                <td>${vehicule.marque}</td>
                                <td>${vehicule.modele}</td>
                                <td>${vehicule.annee}</td>
                            </tr>

              </table>
        </main>
        <footer>
            <a href="CreateVehicule">Client Adding</a>
        </footer>
    </body>
</html>
