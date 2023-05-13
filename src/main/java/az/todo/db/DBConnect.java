package az.todo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    private static Connection connection;

    public static Connection getConn() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/todo", "root","Metin598");
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return connection;
    }
}
