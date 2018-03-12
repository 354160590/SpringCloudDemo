package com.mes.loginserver.service;

import com.mes.loginserver.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Studeng Service
 *
 * @author   单红宇(365384722)
 * @myblog  http://blog.csdn.net/catoop/
 * @create    2016年1月12日
 */
@Service
public class StudentService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> getList(){
        String sql = "SELECT ID,NAME,SCORE_SUM,SCORE_AVG, AGE,BIRTHDAY   FROM STUDENT";
        return (List<Student>) jdbcTemplate.query(sql, new RowMapper<Student>(){

            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student stu = new Student();
                stu.setId(rs.getInt("ID"));
                stu.setAge(rs.getInt("AGE"));
                stu.setName(rs.getString("NAME"));
                stu.setSumScore(rs.getString("SCORE_SUM"));
                stu.setAvgScore(rs.getString("SCORE_AVG"));
                stu.setBirthday(new Date());
                return stu;
            }

        });
    }
}