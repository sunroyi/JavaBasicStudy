package sun.study.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

    static class TestThread implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName() + ":" + i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.submit(new TestThread());
        // 加上Sleep，重用第一个线程
        Thread.sleep(6000);
        pool.submit(new TestThread());
        pool.shutdown();
    }
}
