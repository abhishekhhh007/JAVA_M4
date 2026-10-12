
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>JSP Actions</title>
</head>
<body>

    <jsp:include page="header.jsp" />

    <h3>Student Details</h3>

    <jsp:useBean id="s" class="classes.Student"
                 scope="request" />

    <jsp:setProperty name="s" property="name"
                     value="Abhishek Sukumaran" />

    <jsp:setProperty name="s" property="marks"
                     value="85" />

    <p>Name:
        <jsp:getProperty name="s" property="name" />
    </p>

    <p>Marks:
        <jsp:getProperty name="s" property="marks" />
    </p>

    <p>Click below to demonstrate jsp:forward.</p>

    <a href="forward.jsp">Go to Forward Page</a>

</body>
</html>
