package filters;
import java.io.IOException;
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class LoggingFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {}
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String ipAddress = request.getRemoteAddr();
        String url = request.getLocalName();
        Date date = new Date();
        System.out.println("Request from IP " + ipAddress + " at " + date.toString() + " for " + url);
        chain.doFilter(request, response);
    }
    public void destroy() {}
}
