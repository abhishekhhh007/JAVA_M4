
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
    <title>Error Page</title>
</head>
<body>
    <h2>An Error Occurred!</h2>

    <p>Sorry, an error occurred while processing your request.</p>
    <p>Error Message: <%= exception.getMessage() %></p>
</body>
</html>
