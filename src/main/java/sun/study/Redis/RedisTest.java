package sun.study.Redis;

import common.entity.RestfulResult;
import common.utils.CommUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.entity.ServiceInfo;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class RedisTest {

    @Resource
    private volatile RedisTemplate<String, Object> redisTemplate;

    @RequestMapping(value = "redis/test")
    public void login(HttpServletRequest request, HttpServletResponse response) {

        RestfulResult restfulResult = new RestfulResult();

        redisTemplate.delete("myUser");

        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for(int i=0; i<50; i++){
            // 无锁
            //executorService.submit(new RedisNoLock(redisTemplate));

            // 双重检测锁
            executorService.submit(new RedisLock(redisTemplate));

            // Singleton双重检测锁
            //executorService.submit(new SingletonLock());
        }

        restfulResult.setData("Test End");

        CommUtils.printDataJason(response, restfulResult);
    }
}
