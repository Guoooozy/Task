package controller.Worker;

import service.WorkerService;
import service.impl.WorkerServuceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/feedPlan")
public class feedPlan extends HttpServlet {
    private WorkerService workerService =new WorkerServuceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String plan_name = req.getParameter("plan_name");
        String plan_feedback = req.getParameter("plan_feedback");
        workerService.update(plan_feedback,plan_name);
        resp.sendRedirect("Plan.jsp");
    }
}
