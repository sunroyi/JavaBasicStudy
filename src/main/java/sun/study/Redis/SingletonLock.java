package sun.study.Redis;

import org.springframework.data.redis.core.RedisTemplate;

public class SingletonLock implements Runnable {

    @Override
    public void run() {
        try{
            // 查缓存
            if (Singleton.GetInstance().getNum() == 0){

                // 双重检测锁
                synchronized (this) {

                    if (Singleton.GetInstance().getNum() == 0) {
                        Singleton.GetInstance().setNum(1);
                        System.out.println("从数据库获取数据");
                        System.out.println(Singleton.GetInstance().getNum());
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
