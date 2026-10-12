
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Student Information</h1>");
        out.println("<p><b>Name:</b> Abhishek Sukumaran</p>");
        out.println("<p><b>Roll Number:</b> IT24ICSR012</p>");
        out.println("<p><b>Course:</b> Computer Science</p>");
        out.println("<p><b>College:</b> My College</p>");
        out.println("</body></html>");
    }
}
