package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("theme", "dark");
        Cookie userCookie = new Cookie("username", "admin");
        response.addCookie(userCookie);
        String urlWithSessionID = response.encodeURL("SessionServlet");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Session Management Demo</h1>");
        out.println("<p>Session ID through URL rewriting: " + urlWithSessionID + "</p>");
        out.println("<p>Theme stored in session: " + session.getAttribute("theme") + "</p>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}