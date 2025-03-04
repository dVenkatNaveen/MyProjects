package com.springjdbc.app.repo;

import com.springjdbc.app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student){
        String query="insert into student(rollno,name,marks)value(?,?,?)";
        int r=jdbcTemplate.update(query,student.getRollno(),student.getName(),student.getMarks());
        System.out.println("Row Effected Saved to DB: "+r);
    }

    public List<Student> findAll() {

        System.out.println("Getting all Students");
        String sql="Select * from Student";

        RowMapper<Student> rowMapper= new RowMapper<Student>(){

            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student =new Student();
                student.setRollno(rs.getInt("rollno"));
                student.setName(rs.getString("name"));
                student.setMarks(rs.getInt("marks"));
                return student;
            }
        };
        return jdbcTemplate.query(sql, rowMapper);
    }
}
