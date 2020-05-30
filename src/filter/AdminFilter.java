package filter;

import com.sun.net.httpserver.HttpExchange;
import entity.Workers;
import service.AdminService;
import service.impl.AdminServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.DocumentFilter;
import javax.xml.crypto.dsig.spec.XPathType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebFilter(urlPatterns = {"/AddWorker.jsp","/Admin.jsp","/AddWorker.jsp"})
public class AdminFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        Workers admin = (Workers) session.getAttribute("admin");
        if(admin == null){
            response.sendRedirect("Login.jsp");
        }else{
            filterChain.doFilter(request,response);
        }
    }
}
