package sun.study.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args){

        final String str = "abc";

        ExecutorService es = Executors.newFixedThreadPool(3);
        es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("1:"+ str);
            }
        });

        es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("2:" + str);
            }
        });

        es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("3:" + str);
            }
        });

    }
}
