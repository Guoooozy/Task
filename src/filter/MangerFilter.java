package filter;


import entity.Task;
import entity.Workers;
import service.ManagerService;
import service.impl.ManagerServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebFilter(urlPatterns = {"/AddTask.jsp","/Manger.jsp","/ShowTask.jsp","/ShowWorkers.jsp"})
public class MangerFilter implements Filter {
    ManagerService managerService = new ManagerServiceImpl();
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        Workers manager = (Workers)session.getAttribute("manager");
        if(manager == null){
            response.sendRedirect("Login.jsp");
        }else{
            List<Task> taskList = managerService.showTask(manager.getUsername());
            List<Workers> PartWorkers = managerService.showPartWorkers(manager.getUsername());
            session.setAttribute("taskList",taskList);
            session.setAttribute("PartWorkers",PartWorkers);
            filterChain.doFilter(request,response);
        }
    }
}
