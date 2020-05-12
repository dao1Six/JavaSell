package pratice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

public class Station  implements Runnable {


    int p = 500;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void run() {
        String a = "jjjj";
        Boolean result = stringRedisTemplate.opsForValue().setIfAbsent(a,"锁上");
        if (result) {
            while (p > 0) {

                System.out.println(Thread.currentThread().getName() + "卖出了第" + p + "张票");
                p--;
                stringRedisTemplate.delete(a);
            }
        }else {
            System.out.println("当前系统抢购人数较多，请稍后再试");
        }

    }


}