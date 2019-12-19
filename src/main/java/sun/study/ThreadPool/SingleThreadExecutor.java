package sun.study.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

    public static class Thread1 implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A");
        }
    }

    public static class Thread2 implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    public static class Thread3 implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("C");
        }
    }

    public static void main(String[] args){

        ExecutorService pool = Executors.newSingleThreadExecutor();

        pool.submit(new Thread1());
        pool.submit(new Thread2());
        pool.submit(new Thread3());

        pool.shutdown();
    }
}
