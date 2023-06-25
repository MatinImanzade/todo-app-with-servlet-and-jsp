package az.todo.dao.impl;

import az.todo.dao.inter.TodoDAOInter;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TodoDAOImpl implements TodoDAOInter {

    private Connection connection;

    public TodoDAOImpl(Connection connection){
        super();
        this.connection = connection;
    }

    @Override
    public boolean addTodo(String name, String todo, String status) {
        boolean f = false;

        try {
            String sqlQuerry = "insert into todo_app(name,todo,status) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuerry);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,todo);
            preparedStatement.setString(3,status);

            int i = preparedStatement.executeUpdate();
            if (i==1){
                f = true;
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return f;
    }
}
