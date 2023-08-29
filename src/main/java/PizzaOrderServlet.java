import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pizza-order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String size = req.getParameter("size");
        String[] toppings = req.getParameterValues("toppings");

        System.out.println(crust);
        System.out.println(sauce);
        System.out.println(size);
        System.out.println(toppings.toString());

        req.setAttribute("crust", crust);
        req.setAttribute("sauce", sauce);
        req.setAttribute("size", size);
        req.setAttribute("toppings", toppings);

        req.getRequestDispatcher("pizza-order.jsp").forward(req, resp);
    }
}
