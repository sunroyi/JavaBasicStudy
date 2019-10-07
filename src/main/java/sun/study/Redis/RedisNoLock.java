package sun.study.Redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

public class RedisNoLock implements Runnable {

    private RedisTemplate<String, Object> redisTemplate;

    public RedisNoLock(RedisTemplate<String, Object> redisTemplate){
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void run() {
        try{
            // 查缓存
            String userId = (String) redisTemplate.opsForValue().get("myUser");

            if (userId==null){
                redisTemplate.opsForValue().set("myUser", "sunroyi");
                userId = "sunroyi";
                System.out.println("从数据库获取数据");
            }else{
                System.out.println("从缓存获取数据");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
