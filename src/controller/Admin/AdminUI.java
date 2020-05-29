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

@WebServlet("/Admin")
public class AdminUI extends HttpServlet {
    private AdminService adminService= new AdminServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        switch (type){
            case "add":
                resp.sendRedirect("AddWorker.jsp");
                break;
            case "del":
                break;
            case "change":
                resp.sendRedirect("");
                break;
        }

    }
}
