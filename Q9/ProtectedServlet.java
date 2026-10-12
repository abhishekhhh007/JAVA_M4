
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ProtectedServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        
        if (session == null ||
            session.getAttribute("user") == null) {

            response.sendRedirect("login.html");
            return;
        }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Welcome, Admin!</h2>");
        out.println("<p>Login successful.</p>");
        out.println("<p>This is a protected resource.</p>");
        out.println("<a href='logout'>Logout</a>");
        out.println("</body></html>");
    }
}
