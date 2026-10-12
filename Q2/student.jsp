<%@ page import="java.util.List,com.example.Student" %>
<html>
<head>
    <title>Student Management</title>
</head>
<body>
    <h2>Student Management System</h2>

    <%
        Student s = (Student) request.getAttribute("student");
        if (s == null) s = new Student();

        List<Student> students =
            (List<Student>) request.getAttribute("students");
    %>

    <h3>Add / Update Student</h3>

    <form action="<%= request.getContextPath() %>/students"
          method="post">

        <input type="hidden" name="id"
               value="<%= s.getId() == 0 ? "" : s.getId() %>">

        Name:
        <input type="text" name="name"
               value="<%= s.getName() == null ? "" : s.getName() %>"
               required>
        <br><br>

        Email:
        <input type="email" name="email"
               value="<%= s.getEmail() == null ? "" : s.getEmail() %>"
               required>
        <br><br>

        <button type="submit">Save Student</button>
    </form>

    <h3>Student Records</h3>

    <table border="1" cellpadding="8">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Actions</th>
        </tr>

        <% for (Student st : students) { %>
        <tr>
            <td><%= st.getId() %></td>
            <td><%= st.getName() %></td>
            <td><%= st.getEmail() %></td>
            <td>
                <a href="<%= request.getContextPath() %>/students?edit=<%= st.getId() %>">
                    Edit
                </a>

                <form action="<%= request.getContextPath() %>/students"
                      method="post" style="display:inline">
                    <input type="hidden" name="id"
                           value="<%= st.getId() %>">
                    <input type="hidden" name="action"
                           value="delete">
                    <button type="submit">Delete</button>
                </form>
            </td>
        </tr>
        <% } %>
    </table>
</body>
</html>
