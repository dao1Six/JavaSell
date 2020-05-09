package com.muke.sell.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/deductStock")
    public String deductStock() {
        int stock = Integer.parseInt(stringRedisTemplate.opsForValue().get("sort"));
        if(stock>0){
            int realStock = stock-1;
            stringRedisTemplate.opsForValue().set("sort", String.valueOf(realStock));
            System.out.println("扣减成功，剩余库存"+String.valueOf(realStock));
        }
        else {
            System.out.println("扣减失败");
        }
        return "end";
    }
}
