<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Parkings List</title>
    </head>
    <body>
        <header>
            <h1>Parkings List</h1>
        </header>
        <main>
              <table >
                <tr>
                  <th>Parking Id</th><th> Available Space</th><th>Price Per Hour</th>
                </tr>
                <c:forEach items="${parkingList}" var="parking">
                            <tr>
                                <td>${parking.id}</td>
                                <td>${parking.availableSpaces}</td>
                                <td>${parking.pricePerHour}</td>
                            </tr>
                        </c:forEach>

              </table>
        </main>
        <footer>
            <a href="CreateParking">Parking Creation</a>
        </footer>
    </body>
</html>
