package az.todo.servlet;


import az.todo.dao.impl.TodoDAOImpl;
import az.todo.db.DBConnect;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/add_todo")
public class AddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String todo = request.getParameter("todo");
        String status = request.getParameter("status");



        TodoDAOImpl todoDAO = new TodoDAOImpl(DBConnect.getConn());
        boolean f = todoDAO.addTodo(username,todo,status);

        HttpSession httpSession = request.getSession();
        if (f){
            httpSession.setAttribute("SucMsg","Todo added successfully");
            response.sendRedirect("index.jsp");
        }else {
            httpSession.setAttribute("ErrMsg","Error");
            response.sendRedirect("add_todo.jsp");
        }
    }
}
