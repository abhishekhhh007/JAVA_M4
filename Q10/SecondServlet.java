
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String msg = (String) request.getAttribute("message");

        out.println("<html><body>");
        out.println("<h2>Servlet Chaining Example</h2>");
        out.println("<p>" + msg + "</p>");
        out.println("<p>Request received by SecondServlet</p>");
        out.println("</body></html>");
    }
}
