
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class ReadCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        Cookie[] cookies = request.getCookies();
        String name = null;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("username".equals(cookie.getName())) {
                    name = URLDecoder.decode(
                        cookie.getValue(),
                        StandardCharsets.UTF_8
                    );
                    break;
                }
            }
        }

        if (name != null) {
            response.getWriter().println(
                "<h2>Welcome back, " + escapeHtml(name) + "!</h2>"
            );
        } else {
            response.getWriter().println(
                "<h2>No saved name found.</h2>" +
                "<a href='index.html'>Enter your name</a>"
            );
        }
    }

    private String escapeHtml(String value) {
        return value.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;")
                    .replace("'", "&#39;");
    }
}
