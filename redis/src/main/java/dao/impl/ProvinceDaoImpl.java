package java.dao.impl;


import dao.ProvinceDao;
import domain.Province;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

import java.util.List;

public class ProvinceDaoImpl implements ProvinceDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());


    @Override
    public List<Province> findAll() {
        //定义sql
        String sql = "select * from province";
        //执行sql
        List<Province> list = template.query(sql, new BeanPropertyRowMapper<Province>(Province.class));
        return list;
    }
}
