
<%@ page isErrorPage="true"
         contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Error Handling</title>
</head>
<body>

    <h2>Exception Implicit Object</h2>

    <p>An error occurred in the JSP page.</p>

    <p>Error Message: <%= exception.getMessage() %></p>

</body>
</html>
