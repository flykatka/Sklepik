<%-- 
    Document   : pokazProdukt
    Created on : 2017-04-25, 20:34:33
    Author     : katarzyna_bialach
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Szczegoly Produktu</title>
        <link href="/MojSklepik/css/bootstrap.css" rel="stylesheet">
        <link href="/MojSklepik/css/moje.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="/MojSklepik/js/bootstrap.js"></script>
    </head>
    <body>
        <div class="container">
        <jsp:include page="menu.jsp"/>
        <table class="table table-striped table-hover table-bordered"  width="20%">
            <tr><td><b>Nazwa</b></td><td>${prod.nazwaProduktu}</td></tr>
            <tr><td><b>Cena netto</b></td><td>${prod.cenaNetto}</td></tr>
            <tr><td><b>Producent</b></td><td>${prod.producent}</td></tr>
            <tr><td><b>Kategoria</b></td><td>${prod.kategoria.nazwa}</td></tr>    
        </table>
       </div>
        </body>
</html>
