package sun.study.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {

    public static void main(String[] args){

        ThreadPoolExecutor tpe = new org.apache.tomcat.util.threads.ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));

        for(int i=0;i<15;i++){
            Task task = new Task(i);
            tpe.execute(task);
            System.out.println("线程池中的线程数：" + tpe.getPoolSize() + "，队列中等待执行的任务数：" + tpe.getQueue().size() + "，已执行完的任务数：" + tpe.getCompletedTaskCount());
        }

        tpe.shutdown();
    }
}
