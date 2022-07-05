import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
定义一个方法，查询emp表的数据将其封装为对象，然后装载集合，返回。
 */
public class JdbcDemo7 {
    public static void main(String[] args) {
        List<Emp> list = new JdbcDemo7().findAll();
        System.out.println(list);
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    public List<Emp> findAll() {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        List<Emp> list = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2?characterEncoding=utf8", "root", "4141");
            statement = connection.createStatement();
            String sql = "select * from emp";
            resultSet = statement.executeQuery(sql);
            Emp emp = null;
            list = new ArrayList<Emp>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                double dept_id = resultSet.getDouble("dept_id");
                emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);
                list.add(emp);
            }
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
        return list;
    }
}
