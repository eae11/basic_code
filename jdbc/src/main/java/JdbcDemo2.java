import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
为account表添加一天记录 insert语句
 */
public class JdbcDemo2 {
    public static void main(String[] args) {
        Statement statement = null;
        Connection connection = null;
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取Connection对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2?characterEncoding=utf8", "root", "4141");
            //定义sql
            String sql = "insert into account values(null,'呵呵和',3000)";
            //获取执行sql的对象Statement
            statement = connection.createStatement();
            //执行sql
            int count = statement.executeUpdate(sql);//影响的行数
            //处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //statement.close();
            //避免空指针异常
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
