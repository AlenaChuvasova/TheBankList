<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Accounts</title>
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
<h2>List of all Accounts</h2>
<table>
    <tr>
        <th>ID</th>
        <th>ACCOUNT</th>
        <th>USER_ID</th>
    </tr>
    <c:forEach var="account" items="${accounts}">
        <tr>
            <td>${account.getId()}</td>
            <td>${account.getAccount()}</td>
            <td>${account.getUserId()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
