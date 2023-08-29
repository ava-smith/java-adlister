import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/correct")
public class GuessCorrectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int rand = Integer.parseInt(req.getParameter("rand"));
        int guessedNumber = Integer.parseInt(req.getParameter("guessed-number"));
        req.setAttribute("message", "You Win! You guessed " + guessedNumber + " and the number was " + rand + "!");
        req.getRequestDispatcher("guess-outcome.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
