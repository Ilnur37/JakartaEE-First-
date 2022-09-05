<%@ page import="com.example.jakartaeefirst.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Ильнур
  Date: 05.09.2022
  Time: 23:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Cart</title>
</head>
<body>
    <% Cart cart = (Cart)session.getAttribute("cart"); %>

    <p> Наименование: <%= cart.getName()%> </p>
    <p> Количество: <%= cart.getQuantity()%> </p>
</body>
</html>
