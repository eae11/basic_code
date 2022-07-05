package ser.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import ser.domain.User;
import ser.util.JDBCUtils;

public class UserDao {
    //声明JDBCTemplate对象公用
    private static final JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.dataSource());


    public User login(User loginUser) {
        try {
            String sql = "select * from user where username = ? and password = ?";
            User user = jdbcTemplate.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class), loginUser.getUsername(), loginUser.getPassword());
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();//记录日志
        }
        return null;
    }
}
