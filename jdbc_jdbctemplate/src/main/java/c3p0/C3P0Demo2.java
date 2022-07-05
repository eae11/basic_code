package c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
c3p0的演示
 */
public class C3P0Demo2 {
    public static void main(String[] args) throws SQLException {
        //1.获取DataSource,使用默认配置
        DataSource ds = new ComboPooledDataSource();
        //1.获取DataSource,使用指定名称配置
//        DataSource ds = new ComboPooledDataSource("otherc3p0");
        //2.获取连接

        for (int i = 1; i <= 11; i++) {
            Connection connection = ds.getConnection();
            System.out.println(i + ":" + connection);
            if (i == 5) {
                connection.close();//归还连接到连接池中
            }
        }
    }
}
