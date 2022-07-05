package c2;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://127.0.0.1/mysql";
        String driverClass = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "4141";
        Class.forName(driverClass);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
}
