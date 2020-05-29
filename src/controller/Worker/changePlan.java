package controller.Worker;

import service.WorkerService;
import service.impl.WorkerServuceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/changePlan")
public class changePlan extends HttpServlet {
    private WorkerService workerService = new WorkerServuceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        String plan_name = req.getParameter("plan_name");
        switch (type){
            case "del":
                workerService.delPlan(plan_name);
                break;
            case "change":
                req.getRequestDispatcher("FeedPlan.jsp").forward(req,resp);
                break;
        }
    }
}
