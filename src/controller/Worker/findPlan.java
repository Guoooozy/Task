package controller.Worker;

import entity.Plan;
import service.WorkerService;
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

@WebServlet("/findPlan")
public class findPlan extends HttpServlet {

    private WorkerService workerService = new WorkerServuceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String plan_name = req.getParameter("plan_name");
        String plan_begin_date = req.getParameter("plan_begin_date");
        String task_id = req.getParameter("task_id");
        String feedback = req.getParameter("feedback");

        List<Plan> someplanList = new ArrayList<>();
        someplanList = workerService.findByot(plan_name,plan_begin_date,task_id,feedback);
        req.setAttribute("someplanList",someplanList);
        req.getRequestDispatcher("FindPlan.jsp").forward(req,resp);
    }

}
