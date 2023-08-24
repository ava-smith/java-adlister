import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class CountServlet extends HttpServlet {
    private static int count = 1;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String reset = req.getParameter("reset");
        if (reset != null) {
            count = Integer.parseInt(reset);
            res.getWriter().println("<h1>Count is: " + count + "</h1>");
            res.sendRedirect(getServletContext().getContextPath() + "/count");
        } else {
            res.getWriter().println("<h1>Count is: " + count++ + "</h1>");
        }
    }
}
