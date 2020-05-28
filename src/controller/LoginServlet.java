package controller;

import entity.Workers;
import service.LoginService;
import service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    private LoginService loginService = new LoginServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username;
        username = req.getParameter("username");
        String password = req.getParameter("password");
        String type = req.getParameter("type");
        Object object = loginService.login(username,password,type);
        if(object != null){
            HttpSession session = req.getSession();
            switch (type){
                case "3":
                    Workers worker = (Workers) object;
                    session.setAttribute("worker",worker);
                    resp.sendRedirect("Worker.jsp");
                    break;
                case "1":
                    Workers admin = (Workers) object;
                    session.setAttribute("admin",admin);
                    resp.sendRedirect("Admin.jsp");
                    break;
                case "2":
                    Workers manager = (Workers) object;
                    session.setAttribute("manager",manager);
                    resp.sendRedirect("Manger.jsp");
                    break;
            }
        }else{
            resp.sendRedirect("index.jsp");
        }
    }
}
