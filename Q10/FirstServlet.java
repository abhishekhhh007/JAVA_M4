
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("message",
                "Request processed by FirstServlet");

        RequestDispatcher rd =
                request.getRequestDispatcher("/second");

        rd.forward(request, response);
    }
}
