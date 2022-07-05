import util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
练习：
      需求：

​		1.通过键盘录入用户名和密码

​		2.判断用户是否登录成功
 */
public class JdbcDemo10 {
    public static void main(String[] args) {
        //键盘录入，接收用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        boolean flag = new JdbcDemo10().login2(username, password);
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }

    /*
    登录方法，使用PreparedStatement实现
     */
    public boolean login2(String username, String password) {
        if (username.equals(null) || password.equals(null)) {
            return false;
        }
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "select * from user where username =? and password =?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
//            System.out.println(sql);
            resultSet = preparedStatement.executeQuery();
            return resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, preparedStatement, connection);
        }
        System.out.println("----");
        return false;
    }
}
