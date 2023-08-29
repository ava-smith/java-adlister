import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class GuessNumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("guess.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random rand = new Random();
        int randomNumber = rand.nextInt(3) + 1;
        int guessedNumber = Integer.parseInt(req.getParameter("guessed-number"));

        if(guessedNumber == randomNumber) {
            resp.sendRedirect("/correct?randNum=" + rand + "&userGuess=" + guessedNumber);
        }else if(guessedNumber > 3 || guessedNumber < 0){
            resp.sendRedirect("/guess");
        } else{
            resp.sendRedirect("/incorrect?randNum=" + rand + "&userGuess=" + guessedNumber);
        }
    }
}
