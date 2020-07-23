<%@ page import="by.chuvasova.devtask.banklist.dao.AccountDao" %>
<%@ page import="by.chuvasova.devtask.banklist.service.AccountDaoImpl" %>
<%@ page import="by.chuvasova.devtask.banklist.model.Account" %>
<%@ page import="java.util.Set" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Sum of all accounts in the Bank</title>
    <link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">
    <style>
        <%@include file="/styles/style.css"%>
    </style>
</head>
<body>
<p>
    <a href='<c:url value="/" />'><- main page</a>
</p>
</br>
<h3>
    Sum of all accounts in the Bank:
</h3>
<%
    AccountDao dao = new AccountDaoImpl();
    Set<Account> set = dao.getAllAccounts();
    Integer sum = set.stream().mapToInt(Account::getAccount).sum();
%>
<c:out value="<%=sum%>"></c:out>
</body>
</html>
