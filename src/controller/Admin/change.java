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
import java.sql.SQLException;

@WebServlet("/changeworker")
public class change extends HttpServlet {
    private AdminService adminService= new AdminServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String birthday = req.getParameter("birthday");
        String hire_date = req.getParameter("hire_date");
        String position = req.getParameter("position");
        String qualification = req.getParameter("qualification");
        String experience = req.getParameter("experience");
        String flag = req.getParameter("flag");
        String super_id = req.getParameter("super_id");
        try {
            Object object = adminService.update(username,name,password,sex,birthday,hire_date,position,qualification,experience,flag,super_id);
            if(object!=null){
                resp.sendRedirect("Admin.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
