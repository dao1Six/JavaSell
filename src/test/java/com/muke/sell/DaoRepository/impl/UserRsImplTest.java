package com.muke.sell.DaoRepository.impl;

import com.muke.sell.DAO.User;
import com.muke.sell.DaoRepository.UserRs;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class UserRsImplTest {

    @Autowired
    private UserRs userRs;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void get_AllUser_Test() {
        User user = new User(1, "2323", 22, "男");
        user.getAge();
    }
}