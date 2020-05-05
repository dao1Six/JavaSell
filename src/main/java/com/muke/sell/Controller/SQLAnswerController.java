package com.muke.sell.Controller;


import com.alibaba.fastjson.JSON;
import com.muke.sell.Service.SQLAnswerService;
import com.muke.sell.Util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/SQLAnswer")
public class SQLAnswerController {

    @Autowired
    private SQLAnswerService sqlAnswerService;

    @GetMapping("/001")
    public Message answer001(){
        Message message = new Message();
        List<Map<String,Object>> mapList = sqlAnswerService.answer001();
//        String str= JSON.toJSON(mapList).toString();
        message.setMsg("成功");
        message.setCode("200");
        message.setData(mapList);
        return message;
    }

}
