package controller.Admin;

import entity.Workers;
import service.AdminService;
import service.impl.AdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/DelWorker")
public class del extends HttpServlet {
    private AdminService adminService = new AdminServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String name = req.getParameter("name");
         Boolean bool = (Boolean) adminService.Del(name);
         String type = req.getParameter("type");
         if(bool){
             resp.sendRedirect("Admin.jsp");
         }else{
             resp.sendRedirect("Error.jsp");
         }
    }
}
