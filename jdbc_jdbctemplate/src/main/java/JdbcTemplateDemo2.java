import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
JdbcTemplate入门
 */
public class JdbcTemplateDemo2 {
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Test
    //1. 修改1号数据的 salary 为 10000
    public void test1() {
        String sql = "update emp set salary =10000 where id=1001";
        int count = template.update(sql);
        System.out.println(count);
    }

    @Test
    //2. 添加一条记录
    public void test2() {
        String sql = "insert into emp (id,ename,dept_id) values(?,?,?)";
        int count = template.update(sql, 1015, "郭靖", 10);
        System.out.println(count);
    }

    @Test
    //3. 删除刚才添加的记录
    public void test3() {
        String sql = "delete from emp where id = ?";
        int count = template.update(sql, 1015);
        System.out.println(count);
    }

    @Test
    //4. 查询id为1的记录，将其封装为Map集合
    //注意:这个方法查询的结果集长度只能是1
    public void test4() {
        String sql = "select * from emp where id =?";
        Map<String, Object> map = template.queryForMap(sql, 1001);
        System.out.println(map);
    }

    @Test
    //5. 查询所有记录，将其封装为List

    public void test5() {
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
//        System.out.println(list);
    }

    @Test
    //6.查询所有记录，将其封装为Emp对象的List集合
    public void test6() {
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
                Emp emp = new Emp();
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                double dept_id = resultSet.getDouble("dept_id");
                return emp;
            }
        });
//        List<Emp> list = template.query(sql, (resultSet, i) -> {
//            Emp emp = new Emp();
//            int id = resultSet.getInt("id");
//            String ename = resultSet.getString("ename");
//            int job_id = resultSet.getInt("job_id");
//            int mgr = resultSet.getInt("mgr");
//            Date joindate = resultSet.getDate("joindate");
//            double salary = resultSet.getDouble("salary");
//            double bonus = resultSet.getDouble("bonus");
//            double dept_id = resultSet.getDouble("dept_id");
//            return emp;
//        });
        for (Emp emp : list) {
            System.out.println(emp);
        }

    }

    @Test
    //6.查询所有记录，将其封装为Emp对象的List集合
    public void test6_2() {
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    @Test
    //7.查询总记录
    public void test7() {
        String sql = "select count(id) from emp";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
