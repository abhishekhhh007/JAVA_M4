
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="Student" %>

<jsp:useBean id="student" class="Student"
             scope="request" />

<jsp:setProperty name="student" property="name"
                 param="name" />

<jsp:setProperty name="student" property="course"
                 param="course" />

<%
    request.setAttribute("college", "ABC College");
%>

<html>
<head>
    <title>Student Details</title>
</head>
<body>

    <h2>Student Details Using EL</h2>

    <p>Request Parameter - Name: ${param.name}</p>
    <p>Request Parameter - Course: ${param.course}</p>

    <p>JavaBean Property - Name: ${student.name}</p>
    <p>JavaBean Property - Course: ${student.course}</p>

    <p>Request Attribute - College: ${requestScope.college}</p>

</body>
</html>
