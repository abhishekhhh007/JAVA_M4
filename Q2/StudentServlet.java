package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {
    StudentDAO dao = new StudentDAO();

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws ServletException, IOException {
        try {
            String editId = req.getParameter("edit");

            if (editId != null) {
                req.setAttribute("student",
                    dao.getById(Integer.parseInt(editId)));
            }

            req.setAttribute("students", dao.getAll());
            req.getRequestDispatcher("/student.jsp")
               .forward(req, res);

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
                          throws ServletException, IOException {
        try {
            String action = req.getParameter("action");

            if ("delete".equals(action)) {
                dao.delete(Integer.parseInt(req.getParameter("id")));
            } else {
                Student s = new Student();

                String id = req.getParameter("id");
                s.setId(id == null || id.isEmpty()
                        ? 0 : Integer.parseInt(id));
                s.setName(req.getParameter("name"));
                s.setEmail(req.getParameter("email"));

                dao.save(s);
            }

            res.sendRedirect(req.getContextPath() + "/students");

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
