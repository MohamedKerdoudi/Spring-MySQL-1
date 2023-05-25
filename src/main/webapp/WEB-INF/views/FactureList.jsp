<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Facture List</title>
    </head>
    <body>
        <header>
            <h1>Facture List</h1>
        </header>
        <main>
              <table >
                <tr>
                  <th>Id</th><th> Date</th><th> Montant</th>
                </tr>
               <c:forEach items="${factureList}" var="facture">
                           <tr>
                               <td>${facture.id}</td>
                               <td>${facture.date}</td>
                               <td>${facture.montantTotal}</td>
                           </tr>
                       </c:forEach>

              </table>
        </main>
        <footer>
            <a href="Createfacture">Facture Creation</a>
        </footer>
    </body>
</html>
