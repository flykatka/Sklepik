<%-- 
    Document   : pokazWszystkieAdmin
    Created on : 2017-05-03, 15:30:42
    Author     : katarzyna_bialach
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panel administracyjny</title>
        <link href="/MojSklepik/css/bootstrap.css" rel="stylesheet">
        <link href="/MojSklepik/css/moje.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="/MojSklepik/js/bootstrap.js"></script>
    </head>
    <body>
         <div class="container">

            <jsp:include page="menuAdmin.jsp"/>
            <h1>Wszystkie produkty</h1>

            <a href="dodajProdukt.go" class="btn btn-success"><b><span class="glyphicon glyphicon-plus"></span></b>Dodaj</a><br>



            <table class="table table-striped table-hover table-bordered">
                <tr><td><b>Id</b></td><td><b>Nazwa</b></td><td><b>Cena netto</b></td><td><b>Stan magazynowy</b></td>
                    <td><b>Producent</b></td>
                    <td><b>Kategoria</b></td>
                    <td><b>Akcje</b></td>
                </tr>


                <c:forEach items="${lista}" var="p">
                    <tr><td>${p.idProduktu}</td><td>${p.nazwaProduktu}</td>
                        <td>${p.cenaNetto}</td><td>${p.stanMagazynowy}</td>
                        <td>${p.producent}</td>
                         <td>${p.kategoria.nazwa}</td>
                        <td><a href="edytujProdukt.go?id=${p.idProduktu}" class="btn btn-warning">Edytuj</a>
                            <a href="kasujTo.go?id=${p.idProduktu}" class="btn btn-danger">Kasuj</a>
                             
                        </td>
                    </tr>
                </c:forEach>

            </table>

            <script type="text/javascript">

                var ajaxWhatcha;
                if (window.XMLHttpRequest)
                    ajaxWhatcha = new XMLHttpRequest();
                else if (window.ActiveXObject)
                    ajaxWhatcha = new ActiveXObject("Microsoft.XMLHTTP");


                function sendTheShit() {


                    ajaxWhatcha.onreadystatechange = function () {
                        if (ajaxWhatcha.readyState == 4) {
                            document.getElementById('formEmail').value = "";
                            document.getElementById('formPhone').value = "";
                            document.getElementById('formMessage').value = "";
                            document.getElementById('komunikatFormularz').innerHTML = "OK, wysłano";
                            document.getElementById('komunikatFormularz').style.color = "Red";

                        }
                    }

                    ajaxWhatcha.open("GET", "leaveMessage.do?email=" + document.getElementById("formEmail").value + "&telefon=" + document.getElementById('formPhone').value + "&message=" + document.getElementById("formMessage").value, true);
                    ajaxWhatcha.send(null); // Send it

                }
            </script>


        </div>
    </body>
</html>