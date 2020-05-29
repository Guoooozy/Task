package controller.Admin;

import service.DelWorkerService;
import service.impl.admin.DelWorkerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DelWorker")
public class del extends HttpServlet {
    DelWorkerService delWorkerService = new DelWorkerServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String name = req.getParameter("name");
         Boolean bool = (Boolean) delWorkerService.Del(name);
         if(bool){
             resp.sendRedirect("DelWorker.jsp");
         }else{
             resp.sendRedirect("Error.jsp");
         }
    }
}
