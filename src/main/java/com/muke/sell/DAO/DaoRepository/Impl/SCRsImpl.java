package com.muke.sell.DAO.DaoRepository.Impl;

import com.muke.sell.DAO.DaoRepository.SCRs;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class SCRsImpl implements SCRs {

    private JdbcTemplate jdbcTemplate;

    @Override
    public String addSC(String SId, String CId, String score) {
        String sql = "INSERT INTO SC(SId,CId,score) VALUE(?,?,?,?)";
        Object args[] = {SId,CId,score};
        int student = jdbcTemplate.update(sql,args);
        if (student>0){
            return "添加成绩信息成功 ";
        }

        return "添加成绩信息失败";
    }

    @Override
    public List<Map<String, Object>> queryAllSCs() {
        String sql = "select * from SC";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }
}
