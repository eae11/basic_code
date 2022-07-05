import util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
JDBC工具类演示
 */
public class JdbcDemo8 {
    public static void main(String[] args) {
        List<Emp> list = new JdbcDemo8().findAll2();
        System.out.println(list);
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    public List<Emp> findAll2() {
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        List<Emp> list = null;
        try {
            connection = JDBCUtils.getConnection();
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
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, statement, connection);
        }
        return list;
    }
}
