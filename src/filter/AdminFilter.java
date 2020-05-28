package filter;

import com.sun.net.httpserver.HttpExchange;
import entity.Workers;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.DocumentFilter;
import javax.xml.crypto.dsig.spec.XPathType;
import java.io.IOException;
@WebFilter(urlPatterns = {"/controller/Admin/*","/Admin"})
public class AdminFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        Workers admin = (Workers) session.getAttribute("admin");
        if(admin == null){
            response.sendRedirect("login.jsp");
        }else{
            filterChain.doFilter(request,response);
        }
    }
}
