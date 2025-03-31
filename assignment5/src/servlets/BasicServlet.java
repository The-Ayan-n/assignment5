package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/BasicServlet")
public class BasicServlet extends HttpServlet {
    private String appName;
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        appName = config.getInitParameter("AppName");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletContext context = getServletContext();
        String globalMessage = context.getInitParameter("GlobalMessage");
        out.println("<h1>Welcome to " + appName + "</h1>");
        out.println("<p>Client IP: " + request.getRemoteAddr() + "</p>");
        out.println("<p>User-Agent: " + request.getHeader("User-Agent") + "</p>");
        out.println("<p>Global Message: " + globalMessage + "</p>");
    }
}