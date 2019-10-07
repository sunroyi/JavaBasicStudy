package sun.study.Redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

public class RedisLock implements Runnable {

    private volatile RedisTemplate<String, Object> redisTemplate;

    public RedisLock(RedisTemplate<String, Object> redisTemplate){
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void run() {
        try{
            // 查缓存
            String userId = (String) redisTemplate.opsForValue().get("myUser");

            if (userId == null){

                // 双重检测锁
                // 注意，这里用synchronized(this)是不行的，因为他只锁了自己的实例，锁不住已经被创建的其他实例。
                synchronized (RedisLock.class) {

                    userId = (String) redisTemplate.opsForValue().get("myUser");

                    if (userId == null) {
                        redisTemplate.opsForValue().set("myUser", "sunroyi");
                        System.out.println("从数据库获取数据");
                    }else{
                        System.out.println("从缓存获取数据");
                    }
                }
            }else{
                System.out.println("从缓存获取数据");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
