
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        
        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        String course = request.getParameter("course");

        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Student Details</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Roll Number: " + roll + "</p>");
        out.println("<p>Course: " + course + "</p>");
        out.println("<h3>Registration Successful!</h3>");
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}
