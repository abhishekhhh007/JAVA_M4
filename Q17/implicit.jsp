
<%@ page contentType="text/html;charset=UTF-8"
         errorPage="error.jsp" %>

<html>
<head>
    <title>JSP Implicit Objects</title>
</head>
<body>

    <h2>JSP Implicit Objects</h2>

    <%
        
        String name = request.getParameter("name");
        if (name == null) {
            name = "Abhishek";
        }

        
        response.setHeader("Demo-Header", "JSP");

        
        session.setAttribute("student", name);

        
        application.setAttribute("college", "My College");

        
        String servletName = config.getServletName();

        
        pageContext.setAttribute("course", "Computer Science");

        
        String errorDemo = request.getParameter("error");
        if ("yes".equals(errorDemo)) {
            int x = 10 / 0;
        }
    %>

    <p>Request - Student Name: <%= name %></p>

    <p>Response - Header set: Demo-Header = JSP</p>

    <p>Session - Student: <%= session.getAttribute("student") %></p>

    <p>Application - College:
        <%= application.getAttribute("college") %>
    </p>

    <p>Out - This text is displayed using out.</p>
    <%
        out.println("<p>Output generated using out object.</p>");
    %>

    <p>Config - Servlet Name: <%= servletName %></p>

    <p>PageContext - Course:
        <%= pageContext.getAttribute("course") %>
    </p>

    <p>Page - Current JSP object:
        <%= page.getClass().getName() %>
    </p>

    <p>
        <a href="implicit.jsp?name=Rahul">Change Student Name</a>
    </p>

    <p>
        <a href="implicit.jsp?error=yes">Test Exception</a>
    </p>

</body>
</html>
