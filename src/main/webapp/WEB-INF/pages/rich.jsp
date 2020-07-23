<%@ page import="by.chuvasova.devtask.banklist.dao.AccountDao" %>
<%@ page import="by.chuvasova.devtask.banklist.service.AccountDaoImpl" %>
<%@ page import="by.chuvasova.devtask.banklist.dao.ClientDao" %>
<%@ page import="by.chuvasova.devtask.banklist.service.ClientDaoImpl" %>
<%@ page import="by.chuvasova.devtask.banklist.model.Account" %>
<%@ page import="by.chuvasova.devtask.banklist.model.Client" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Richest client</title>
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
<h3>Richest client is:</h3>
<% AccountDao dao = new AccountDaoImpl();
    Set<Account> set = null;
    try {
        set = dao.getAllAccounts();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Map<Integer, Integer> sum = set.stream()
            .collect(Collectors.
                    groupingBy(Account::getUserId,
                            Collectors.summingInt(Account::getAccount)));
    Integer max = sum.entrySet()
            .stream()
            .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
            .get()
            .getKey();
    ClientDao clientDao = new ClientDaoImpl();
    Client rich = null;
    try {
        rich = clientDao.getClientById(max);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    String richName = rich.getName();
    String richSurname = rich.getSurname();
    String richestClient = richName + " " + richSurname;
%>
<c:out value="<%=richestClient%>"></c:out>
</body>
</html>
