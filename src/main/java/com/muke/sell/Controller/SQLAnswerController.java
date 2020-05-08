package com.muke.sell.Controller;


import com.muke.sell.Service.SQLAnswerService;
import com.muke.sell.Util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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
    @Cacheable(cacheNames = "answer001",key = "123")
    public Response answer001(){

        List<Map<String,Object>> mapList = sqlAnswerService.answer001();
        Response response = Response.createResponseBySuccess(mapList);
        return response;
    }

}
