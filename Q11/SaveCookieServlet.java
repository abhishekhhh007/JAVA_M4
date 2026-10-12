
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class SaveCookieServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("username");

        Cookie cookie = new Cookie(
            "username",
            URLEncoder.encode(name, StandardCharsets.UTF_8)
        );

        cookie.setMaxAge(60 * 60 * 24); 
        cookie.setHttpOnly(true);
        cookie.setPath(request.getContextPath() + "/");

        response.addCookie(cookie);

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(
            "<h2>Name saved in cookie successfully!</h2>" +
            "<a href='read'>Read Saved Name</a>"
        );
    }
}
