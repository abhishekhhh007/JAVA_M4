
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ErrorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        
        throw new ServletException(
            "An intentional error occurred!"
        );
    }
}
