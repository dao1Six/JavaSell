package com.muke.sell.DAO.DaoRepository.Impl;

import com.muke.sell.DAO.DaoRepository.StudentRs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentRsImpl implements StudentRs {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String addStudent(String SId, String Sname, String Sage, String Ssex) {
        String sql = "INSERT INTO Student(SId,Sname,Sage,Ssex) VALUE(?,?,?,?)";
        Object args[] = {SId,Sname,Sage,Ssex};
        int student = jdbcTemplate.update(sql,args);
        if (student>0){
            return "添加学生"+Sname+"信息成功 ";
        }

        return "添加学生信息失败";
    }

    @Override
    public List<Map<String, Object>> queryAllStudents() {
        String sql = "select * from Student";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }
}
