
import jakarta.servlet.*;
import java.io.*;

public class GenericExample extends GenericServlet {

    public void service(ServletRequest request,
                        ServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>GenericServlet Example</h2>");
        out.println("<p>This servlet uses the service() method.</p>");
        out.println("<p>GenericServlet is protocol-independent.</p>");
        out.println("</body></html>");
    }
}
