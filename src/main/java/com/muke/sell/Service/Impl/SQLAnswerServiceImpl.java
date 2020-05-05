package com.muke.sell.Service.Impl;

import com.muke.sell.Service.SQLAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class SQLAnswerServiceImpl implements SQLAnswerService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Map<String, Object>> answer001() {
        String sql = "SELECT a.SId,a.CId,a.score AS '01科目成绩',b.score AS '02科目成绩' FROM " +
                "(SELECT * FROM SC WHERE CId = 01 )AS a, " +
                "(SELECT * FROM SC WHERE CId = 02 )AS b " +
                "WHERE a.SId = b.SId AND a.score>b.score ";

        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql);
        return mapList;
    }
}
