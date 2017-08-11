<%-- 
    Document   : dodajProduktNew
    Created on : 2017-05-03, 14:52:26
    Author     : katarzyna_bialach
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dodawanie/edycja produktu</title>
        <link href="/MojSklepik/css/bootstrap.css" rel="stylesheet">
        <link href="/MojSklepik/css/moje.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="/MojSklepik/js/bootstrap.js"></script>
    </head>
    <body>
        <div class="container">
            <jsp:include page="menuAdmin.jsp"/>
            <h1>Własności produktu</h1>
            <form:form method="POST" modelAttribute="produkt" >

                <form:hidden  path="idProduktu"/>
                <table class="table table-striped table-hover table-bordered">            
                    <tr><td>Nazwa produktu</td><td><form:input  class="form-control"  path="nazwaProduktu"/></td></tr>
                    <tr><td>Cena netto</td><td><form:input type="number" class="form-control" path="cenaNetto"/></td></tr>
                    <tr><td>Stan magazynowy</td><td><form:input type="number"  class="form-control" path="stanMagazynowy"/></td></tr>
                    <tr><td>Producent</td><td><form:input  class="form-control"  path="producent"/></td></tr>           
                    <tr><td>Kategoria</td><td>

                            <form:select path="kategoria.idKategorii">
                                <c:forEach items="${kategorie}" var="k">
                                    <c:choose>
                                        <c:when test="${k.idKategorii==produkt.kategoria.idKategorii}">
                                                <option selected="true" value=${k.idKategorii} >${k.nazwa}</option>     
                                        </c:when>
                                <c:otherwise>
                                      <option value=${k.idKategorii}>${k.nazwa}</option>     
                                </c:otherwise>
                            </c:choose>

                        </c:forEach>
                    </form:select>

                    </td></tr>
                </table>
                <input type="submit" value="zapisz" class="btn btn-success"/> <a href="pokazWszystkieAdmin.go" class="btn btn-warning">Anuluj</a>
            </form:form>
        </div>

    </body>
</html>