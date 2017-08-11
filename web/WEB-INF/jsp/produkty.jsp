<%-- 
    Document   : produkty
    Created on : 2017-04-24, 21:25:50
    Author     : katarzyna_bialach
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wszystkie produkty</title>
        <link href="/MojSklepik/css/bootstrap.css" rel="stylesheet">
        <link href="/MojSklepik/css/moje.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="/MojSklepik/js/bootstrap.js"></script>
    </head>
    <body>
        <div class="container">
        <jsp:include page="menu.jsp"/>
        <h1>Wszystkie produkty</h1>
        <table class="table table-striped table-hover table-bordered">
            <tr><td><b>Nazwa</b></td><td><b>Cena netto</b></td>
                <td><b>Producent</b></td>
                <td><b>Kategoria</b></td>
                <td><b>Akcje</b></td>
            </tr>


            <c:forEach items="${lista}" var="p">
                <tr><td>${p.nazwaProduktu}</td>
                    <td>${p.cenaNetto}</td>
                    <td>${ p.producent}</td>
                    <td>${ p.kategoria.nazwa}</td>
                    <td><a href="pokazProdukt.do?id=${p.idProduktu}" class="btn btn-info">Pokaż szczegóły</a>
                    <a href="dodajDoKoszyka.go?id=${p.idProduktu}" class="btn btn-success">Dodaj do koszyka</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
        </div>
    </body>
</html>
