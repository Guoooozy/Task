package filter;

import entity.Plan;
import entity.Workers;
import javafx.concurrent.Worker;
import service.ManagerService;
import service.WorkerService;
import service.impl.ManagerServiceImpl;
import service.impl.WorkerServuceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebFilter(urlPatterns = {"/Plan.jsp","/AddPlan.jsp","/FeedPlan.jsp","/FindPlan.jsp"})
public class WorkerFilter implements Filter {
    private WorkerService workerService = new WorkerServuceImpl();
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        Workers worker = (Workers)session.getAttribute("worker");
        if(worker == null||!worker.getFlag().equals("3")){
            response.sendRedirect("Login.jsp");
        }else{
            List<Plan> planList = new ArrayList<>();
            planList = workerService.findAll();
            session.setAttribute("planList",planList);
            filterChain.doFilter(request,response);
        }
    }
}
