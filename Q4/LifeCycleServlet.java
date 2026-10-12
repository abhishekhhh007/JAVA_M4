
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init() method executed");
    }

    @Override
    protected void service(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("service() method executed");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Servlet Life Cycle</h2>");
        out.println("<p>init() method executed</p>");
        out.println("<p>service() method executed</p>");
        out.println("<p>destroy() runs when the servlet is taken out of service.</p>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() method executed");
    }
}
