<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>The Bank List</title>
    <link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">
    <style>
        <%@include file="/styles/style.css"%>
    </style>
</head>
<body>
<h1>The Bank List</h1>
<ul id="navbar">
    <li id="getclient">
        <form method="post" action="client" id="form">
            <label><h3>Get Client by ID</h3></label>
            <input type="text" name="id" placeholder="enter ID">
            <button onclick="location.href='/client'">GET</button>
        </form>
    </li>
    <li>
        <label><h3>Get list of all accounts</h3></label>
        <button onclick="location.href='/accounts'">GET</button>
    </li>
    <li>
        <label><h3>Get richest client</h3></label>
        <button onclick="location.href='/rich'">GET</button>
    </li>
    <li>
        <label><h3>Get accounts sum</h3></label>
        <button onclick="location.href='/sum'">GET</button>
    </li>
</ul>
</body>
</html>
