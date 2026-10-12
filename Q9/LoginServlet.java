
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        
        if ("admin".equals(username) &&
            "1234".equals(password)) {

            HttpSession session = request.getSession();
            session.setAttribute("user", username);

            response.sendRedirect("protected");
        } else {
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println(
                "<h3>Invalid username or password!</h3>" +
                "<a href='login.html'>Try Again</a>"
            );
        }
    }
}
