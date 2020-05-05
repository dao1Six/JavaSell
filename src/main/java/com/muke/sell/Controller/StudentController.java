package com.muke.sell.Controller;


import com.muke.sell.DAO.DaoRepository.StudentRs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    private StudentRs studentRs;

    @PostMapping("/add")
    public String addStudent(@RequestParam("SId") String SID,@RequestParam("Sname") String Sname,
                                @RequestParam("Sage") String Sage,@RequestParam("Ssex") String Ssex){
        String msg = studentRs.addStudent(SID,Sname,Sage,Ssex);
        return msg;
    }



}
