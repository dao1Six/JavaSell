package com.muke.sell.Service.Impl;

import com.muke.sell.Service.SQLAnswerService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
class SQLAnswerServiceImplTest {

    @Autowired
    private SQLAnswerService sqlAnswerService;

    @Test
    void answer001() {
        List<Map<String,Object>> mapList = sqlAnswerService.answer001();
        System.out.println(mapList);
    }
}