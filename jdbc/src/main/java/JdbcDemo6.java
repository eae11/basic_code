import java.sql.*;

/*
account表 删除一条记录
 */
public class JdbcDemo6 {
    public static void main(String[] args) {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2?characterEncoding=utf8", "root", "4141");
            statement = connection.createStatement();
            String sql = "select * from account";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                double balance = resultSet.getDouble(3);
                System.out.println(id + "--" + name + "--" + balance);
            }

//            //让游标向下移动一行
//            resultSet.next();
//            int id = resultSet.getInt(1);
//            String name = resultSet.getString("name");
//            double balance = resultSet.getDouble(3);
//            System.out.println(id + "--" + name + "--" + balance);
//
//
//            resultSet.next();
//            int id2 = resultSet.getInt(1);
//            String name2 = resultSet.getString("name");
//            double balance2 = resultSet.getDouble(3);
//            System.out.println(id2 + "--" + name2 + "--" + balance2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
