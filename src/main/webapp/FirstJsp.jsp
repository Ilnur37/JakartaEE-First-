<%--
  Created by IntelliJ IDEA.
  User: ilnur
  Date: 04.09.2022
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Date Jsp</title>
</head>
<body>
<h1>Test JSP</h1>
<p>
    <%
        java.util.Date now = new java.util.Date();
        String date = "Текущее время: " + now;
    %>
    <%= date%>
</p>
</body>
</html>
