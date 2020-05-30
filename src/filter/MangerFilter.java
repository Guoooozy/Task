package filter;


import entity.Workers;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebFilter(urlPatterns = {"/AddTask.jsp","/Manger.jsp","/ShowTask.jsp","/ShowWorkers.jsp"})
public class MangerFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        Workers worker = (Workers)session.getAttribute("manager");
        if(worker == null){
            response.sendRedirect("Login.jsp");
        }else{
            filterChain.doFilter(request,response);
        }
    }
}
