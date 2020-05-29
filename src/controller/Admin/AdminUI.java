package controller.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Admin")
public class AdminUI extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        switch (type){
            case "add":
                resp.sendRedirect("AddWorker.jsp");
                break;
            case "del":
                resp.sendRedirect("DelWorker.jsp");
                break;
            case "change":
                resp.sendRedirect("");
                break;
        }

    }
}
