import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@SuppressWarnings({ "serial", "unused" })
@WebServlet("/premierServlet")
public class PremierServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		response.getWriter().println("Hello World");
	}
}