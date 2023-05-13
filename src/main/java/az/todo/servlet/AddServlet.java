package az.todo.servlet;


import az.todo.dao.impl.TodoDAO;
import az.todo.db.DBConnect;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/add_todo")
public class AddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String todo = req.getParameter("todo");
        String status = req.getParameter("status");

        TodoDAO todoDAO = new TodoDAO(DBConnect.getConn());
        boolean f = todoDAO.addTodo(username,todo,status);

        if (f){
            resp.sendRedirect("index.jsp");
        }else {
            resp.sendRedirect("add_todo.jsp");
        }
    }
}
