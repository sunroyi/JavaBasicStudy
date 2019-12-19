package sun.study.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args){

        final String str = "abc";

        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-1:"+ str);
            }
        });

        pool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-2:" + str);
            }
        });

        pool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-3:" + str);
            }
        });

        pool.shutdown();
    }
}
