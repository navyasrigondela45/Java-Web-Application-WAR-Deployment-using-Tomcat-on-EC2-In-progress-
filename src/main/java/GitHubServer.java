import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/")
public class GitHubServer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String html = "<html><body style='text-align:center;margin-top:100px;'>"
                + "<h1>🚀 Welcome to My DevOps WAR Project automated with Jenkins</h1>"
                + "<a href='https://github.com/navyasrigondela45'>GitHub</a><br><br>"
                + "<a href='https://www.linkedin.com/in/navya-sri-gondela-a60091258'>LinkedIn</a>"
                + "</body></html>";

        response.getWriter().write(html);
    }
}
