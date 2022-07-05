package druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.net.URL;
import java.sql.Connection;
import java.util.Properties;

/*
Druid
 */
public class DruidDemo1 {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.定义配置文件
        //3.获取连接池对象
        Properties pro = new Properties();
        ClassLoader classLoader = DruidDemo1.class.getClassLoader();
        URL resource = classLoader.getResource("druid.properties");
        String path = resource.getPath();
        pro.load(new FileReader(path));
        //4.获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        //5.获取连接
        Connection connection = ds.getConnection();
        System.out.println(connection);
    }
}
