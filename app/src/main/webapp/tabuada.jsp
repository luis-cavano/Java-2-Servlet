<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabuada</title>
</head>
<body>
    <form action="/tabuada" method="post">
        <input type="number" name="numero" />
        <button type="submit">Calcular</button>
    </form>
    <hr />
    <c:forEach var="num" items="${resultados}">
        ${num} <br/>
    </c:forEach>
</body>
</html>