package controller.Admin;

import entity.Workers;
import repository.impl.admin.AddWorkerImpl;
import service.AddService;
import service.impl.admin.AddServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/addwoker")
public class add extends HttpServlet {
    private AddService addService = new AddServiceImpl();
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
            Object object = addService.add(username,name,password,sex,birthday,hire_date,position,qualification,experience,flag,super_id);
            if(object!=null){
                resp.sendRedirect("Admin.jsp");
                Workers workers=(Workers) object;
                System.out.println(workers);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
