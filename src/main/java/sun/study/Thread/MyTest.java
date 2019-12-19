package sun.study.Thread;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MyTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    clsCount.Add();
                }
            }).start();
        }

        Thread.sleep(1000);

        clsCount.print();

        clsCount.printCallable();
    }

    static class clsCount{
        private static int count = 0;

        clsCount() throws ExecutionException, InterruptedException {
        }

        public static void Add(){
            for(int i=0;i<1000;i++) {
                count++;
            }
        }

        public static void print(){
            System.out.println(count);
        }

        public static void printCallable() throws ExecutionException, InterruptedException {

            Callable<String> task = new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(1000);
                    return "Success";
                }
            };

            FutureTask<String> future = new FutureTask<String>(task);
            new Thread(future).start();

            String result = future.get();
            System.out.println(result);
        }
    }
}
