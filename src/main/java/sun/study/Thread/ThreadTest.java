package sun.study.Thread;

import java.util.concurrent.*;

public class ThreadTest {

    public static void main(String[] args){
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                System.out.println("继承Thread Start");
                try {
                    Thread.sleep(1000);
                    System.out.println("继承Thread End");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.run();
            }
        };
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("实现Runnable");
            }
        });
        thread2.start();

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "实现Callable接口";
            }
        });

        try{
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
