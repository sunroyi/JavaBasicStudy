package sun.study.ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolTest1 {

    public static void main(String[] args) throws InterruptedException {
        RejectImpl reject = new RejectImpl();
        ThreadFactory factory = Executors.defaultThreadFactory();
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(3,5,200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(3), factory, reject);

        for(int i=0;i<10;i++){
            tpe.execute(new task());
        }

        Thread.sleep(15000);
        tpe.shutdown();
    }

    static class RejectImpl implements RejectedExecutionHandler{
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println(r.toString() + " is rejected");
        }
    }

    static class task implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end");
        }
    }
}
