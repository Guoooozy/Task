package controller.Manger;

import entity.Task;
import service.ManagerService;
import service.impl.ManagerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/addTask")
public class addTask extends HttpServlet {
    private ManagerService managerService = new ManagerServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Task task = new Task(req.getParameter("id"),req.getParameter("task_name"),req.getParameter("task_begin_time"),req.getParameter("task_end_time"),req.getParameter("task_description"),req.getParameter("task_state"),req.getParameter("staff_id"),req.getParameter("emp_id"));
        managerService.addManger(task);
        resp.sendRedirect("Manger.jsp");
    }
}
