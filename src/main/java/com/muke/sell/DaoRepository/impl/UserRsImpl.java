package com.muke.sell.DaoRepository.impl;

import com.muke.sell.DAO.User;
import com.muke.sell.DaoRepository.UserRs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("UserRs")
public class UserRsImpl implements UserRs {



    @Autowired
    private JdbcTemplate jdbcTemplate;



    @Override
    public User querryBy_name(String name) {
        String sql = "SELECT * FROM user WHERE name = ?";
//        User user = this.jdbcTemplate.execute(sql, new RowMapper<User>();
        return null;
    }

    @Override
    public List<User> get_adult() {
        return null;
    }

    @Override
    public List<User> querryBy_sex(String sex) {
        return null;
    }

    @Override
    public List<User> get_AllUser() {
        String sql = "SELECT * FROM user";
        this.jdbcTemplate.execute(sql);

        return null;
    }
}
