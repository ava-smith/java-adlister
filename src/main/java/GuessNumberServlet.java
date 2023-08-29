import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class GuessNumberServlet extends HttpServlet {
    Random rand = new Random();
    int randomNumber = rand.nextInt(3);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("guess.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String guessedNumber = req.getParameter("guessed-number");
        if(Integer.parseInt(guessedNumber) == randomNumber) {
            resp.sendRedirect("correct.jsp");
        }else {
            resp.sendRedirect("incorrect.jsp");
        }
    }
}
