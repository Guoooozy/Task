package controller.Worker;

import entity.Plan;
import service.WorkerService;
import service.impl.WorkerServuceImpl;

import javax.lang.model.element.NestingKind;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addPlan")
public class addPlan extends HttpServlet {
    private WorkerService workerService = new WorkerServuceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String plan_name = req.getParameter("plan_name");
        String plan_state = req.getParameter("plan_state");
        String feedback = req.getParameter("feedback");
        String plan_begin_date = req.getParameter("plan_begin_date");
        String plan_end_date = req.getParameter("plan_end_date");
        String plan_discription = req.getParameter("plan_discription");
        String plan_feedback = req.getParameter("plan_feedback");
        String task_id = req.getParameter("task_id");
        workerService.makePlan(new Plan(id,plan_name,plan_state,feedback,plan_begin_date,plan_end_date,plan_discription,plan_feedback,task_id));
        resp.sendRedirect("Plan.jsp");
    }
}
