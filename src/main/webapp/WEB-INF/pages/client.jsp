<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Client by ID</title>
    <link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">
    <style>
        <%@include file="/styles/style.css"%>
    </style>
</head>
<body>
<p>
    <a href='<c:url value="/"/>'><- main page</a>
</p>
</br>
<c:choose>
    <c:when test="${client == null}">
        <p>No Client with input ID!!!</p>
    </c:when>
    <c:otherwise>
        <table>
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>SURNAME</th>
            </tr>
            <tr>
                <td>${client.getId()}</td>
                <td>${client.getName()}</td>
                <td>${client.getSurname()}</td>
            </tr>
        </table>
    </c:otherwise>
</c:choose>
</body>
</html>