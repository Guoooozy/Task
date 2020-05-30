package controller;

import entity.Plan;
import entity.Task;
import entity.Workers;
import service.AdminService;
import service.LoginService;
import service.ManagerService;
import service.WorkerService;
import service.impl.AdminServiceImpl;
import service.impl.LoginServiceImpl;
import service.impl.ManagerServiceImpl;
import service.impl.WorkerServuceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    private LoginService loginService = new LoginServiceImpl();
    private AdminService adminService = new AdminServiceImpl();
    private WorkerService workerService = new WorkerServuceImpl();
    private ManagerService managerService = new ManagerServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username;
        username = req.getParameter("username");
        String password = req.getParameter("password");
        String type = req.getParameter("type");

        Object object = loginService.login(username,password,type);
        if(object != null){
            HttpSession session = req.getSession();
            switch (type){
                case "3":
                    Workers worker = (Workers) object;
                    session.setAttribute("worker",worker);
                    List<Plan> planList = new ArrayList<>();
                    planList = workerService.findAll();
                    session.setAttribute("planList",planList);
                    resp.sendRedirect("Plan.jsp");
                    break;
                case "1":
                    Workers admin = (Workers) object;
                    session.setAttribute("admin",admin);
                    List<Workers> workersList = new ArrayList<>();
                    workersList = adminService.FindAll();
                    req.setAttribute("list",workersList);
                    resp.sendRedirect("Admin.jsp");
                    break;
                case "2":
                    Workers manager = (Workers) object;
                    session.setAttribute("manager",manager);
                    List<Task> taskList = managerService.showTask(manager.getUsername());
                    List<Workers> PartWorkers = managerService.showPartWorkers(manager.getUsername());
                    session.setAttribute("taskList",taskList);
                    session.setAttribute("PartWorkers",PartWorkers);
                    resp.sendRedirect("Manger.jsp");
                    break;
            }
        }else{
            resp.sendRedirect("index.jsp");
        }
    }
}
