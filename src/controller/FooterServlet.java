package controller;

import entity.Workers;
import javafx.concurrent.Worker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/Footer")
public class FooterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Workers worker = (Workers)session.getAttribute("worker");
        String type = worker.getFlag();
        switch (type){
            case "1":
                req.getRequestDispatcher("Admin.jsp").forward(req,resp);
                break;
            case "2":
                req.getRequestDispatcher("Manger.jsp").forward(req,resp);
                break;
            case "3":
                req.getRequestDispatcher("Plan.jsp").forward(req,resp);
                break;
            default:
                resp.sendRedirect("Login.jsp");
        }
    }
}
