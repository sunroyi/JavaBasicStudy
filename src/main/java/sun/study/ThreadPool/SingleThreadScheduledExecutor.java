package sun.study.ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SingleThreadScheduledExecutor {

    static class TestThread implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ":Hello");
        }
    }

    public static void main(String[] args){
        ScheduledExecutorService pool = Executors.newSingleThreadScheduledExecutor();
        // 1秒后执行
        pool.schedule(new TestThread(), 1, TimeUnit.SECONDS);
        // 首次在1秒后执行，之后每隔2秒执行，不可加pool.shutdown()
        //pool.scheduleAtFixedRate(new TestThread(), 1, 2, TimeUnit.SECONDS);
        // 首次在1秒后执行，在上一次执行完1秒后再执行，不可加pool.shutdown()
        //pool.scheduleWithFixedDelay(new TestThread(), 1,1, TimeUnit.SECONDS);
        pool.shutdown();
    }
}
