package sun.study.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

    public static class Thread1 implements Runnable{

        @Override
        public void run() {
            System.out.println("A");
        }
    }

    public static class Thread2 implements Runnable{

        @Override
        public void run() {
            System.out.println("B");
        }
    }

    public static class Thread3 implements Runnable{

        @Override
        public void run() {
            System.out.println("C");
        }
    }

    public static void main(String[] args){

        ExecutorService es = Executors.newSingleThreadExecutor();

        es.submit(new Thread1());
        es.submit(new Thread2());
        es.submit(new Thread3());

        es.shutdown();
    }
}
