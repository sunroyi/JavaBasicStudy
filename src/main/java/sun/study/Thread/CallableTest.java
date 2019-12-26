package sun.study.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> futureTask = new FutureTask<String>(new CallableThread());
        new Thread(futureTask).start();
        Thread newThread = new Thread(new RunnableThread());
        newThread.start();
        System.out.println("Start");
        System.out.println("Waiting...");
        System.out.println(futureTask.get());
        System.out.println("End");
    }

    static class CallableThread implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(2000);
            return "Success";
        }
    }

    static class RunnableThread implements Runnable{

        @Override
        public void run() {
            System.out.println("Runnable THread is running");
        }
    }
}
