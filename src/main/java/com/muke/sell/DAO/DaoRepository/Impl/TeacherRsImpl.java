package com.muke.sell.DAO.DaoRepository.Impl;

import com.muke.sell.DAO.DaoRepository.TeacherRs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class TeacherRsImpl implements TeacherRs {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String addTeacher(String TId, String Tname) {
        String sql = "INSERT INTO Teacher(TId,Tname) VALUE(?,?,?,?)";
        Object args[] = {TId,Tname};
        int student = jdbcTemplate.update(sql,args);
        if (student>0){
            return "添加教师"+Tname+"信息成功 ";
        }

        return "添加教师信息失败";
    }

    @Override
    public List<Map<String, Object>> queryAllTeachers() {
        String sql = "select * from Teacher";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }
}
