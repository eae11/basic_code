import util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
练习：
      需求：

​		1.通过键盘录入用户名和密码

​		2.判断用户是否登录成功
 */
public class JdbcDemo9 {
    public static void main(String[] args) {
        //键盘录入，接收用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        boolean flag = new JdbcDemo9().login(username, password);
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }

    /*
    登录方法
     */
    public boolean login(String username, String password) {
        if (username.equals(null) || password.equals(null)) {
            return false;
        }
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "select * from user where username ='" + username + "' and password ='" + password + "'";
            System.out.println(sql);
            resultSet = statement.executeQuery(sql);
            return resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, statement, connection);
        }
        return false;
    }
}