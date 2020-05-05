package com.muke.sell.DAO.DaoRepository.Impl;

import com.muke.sell.DAO.DaoRepository.CourseRs;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class CourseRsImpl implements CourseRs {
    private JdbcTemplate jdbcTemplate;

    @Override
    public String addCourse(String CId, String Cname, String TId) {
        String sql = "INSERT INTO Course(CId,Cname,TId) VALUE(?,?,?,?)";
        Object args[] = {CId,Cname,TId};
        int student = jdbcTemplate.update(sql,args);
        if (student>0){
            return "添加科目信息成功 ";
        }

        return "添加科目信息失败";
    }

    @Override
    public List<Map<String, Object>> queryAllCourses() {
        String sql = "select * from Course";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }
}
