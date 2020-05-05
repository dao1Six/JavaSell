package com.muke.sell.DAO.DaoRepository.Impl;

import com.muke.sell.DAO.DaoRepository.StudentRs;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentRsImplTest {

    @Autowired
    private StudentRs studentRs;
    @Test
    void addStudent() {
        String msg = studentRs.addStudent("01" , "赵雷" , "1990-01-01" , "男");
        System.out.println(msg);
    }

    @Test
    void queryAllStudents(){
        List<Map<String, Object>> mapList = studentRs.queryAllStudents();
        System.out.println(mapList);
    }
}