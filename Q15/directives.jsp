
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page errorPage="error.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Directives</title>
</head>
<body>
    <h2>JSP Page Directives</h2>

    <p>Student Name: Abhishek Sukumaran</p>
    <p>Current Date and Time: <%= new Date() %></p>

    <%
        int a = 10;
        int b = 0;
        int result = a / b;
    %>

    <p>Result: <%= result %></p>
</body>
</html>
