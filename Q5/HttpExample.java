
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class HttpExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>HttpServlet Example</h2>");
        out.println("<p>This servlet uses the doGet() method.</p>");
        out.println("<p>HttpServlet is designed for HTTP requests.</p>");
        out.println("</body></html>");
    }
}
