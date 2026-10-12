
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;

public class CartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        List<String> cart =
            (List<String>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }

        String action = request.getParameter("action");
        String product = request.getParameter("product");

        if ("add".equals(action)) {
            if ("Laptop".equals(product) ||
                "Mouse".equals(product) ||
                "Keyboard".equals(product)) {
                cart.add(product);
            }
        } else if ("clear".equals(action)) {
            cart.clear();
        }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Your Shopping Cart</h2>");

        if (cart.isEmpty()) {
            out.println("<p>Cart is empty.</p>");
        } else {
            out.println("<ul>");

            for (String item : cart) {
                out.println("<li>" + item + "</li>");
            }

            out.println("</ul>");
        }

        out.println("<p>Total items: " + cart.size() + "</p>");
        out.println("<a href='index.html'>Continue Shopping</a>");
        out.println("</body></html>");
    }
}
