
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class RequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");

        out.println("<html><body>");
        out.println("<h2>GET Request</h2>");
        out.println("<p>Student Name: " + name + "</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");

        out.println("<html><body>");
        out.println("<h2>POST Request</h2>");
        out.println("<p>Student Name: " + name + "</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doHead(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("X-Request-Type", "HEAD");
        response.setStatus(HttpServletResponse.SC_OK);

        
    }
}
