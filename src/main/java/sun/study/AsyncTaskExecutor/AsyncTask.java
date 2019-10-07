package sun.study.AsyncTaskExecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.AsyncResult;

import java.util.concurrent.Future;

@Component
public class AsyncTask {

    @Async("asyncTaskExecutor")
    public Future<String> doTaskA() throws InterruptedException {
        System.out.println("开始执行任务A");
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("结束任务A，耗时：" + (end-start) + "ms");
        return new AsyncResult("TaskA Done");
    }

    @Async("asyncTaskExecutor")
    public Future<String> doTaskB() throws InterruptedException {
        System.out.println("开始执行任务B");
        long start = System.currentTimeMillis();
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        System.out.println("结束任务B，耗时：" + (end-start) + "ms");
        return new AsyncResult("TaskB Done");
    }

    @Async("asyncTaskExecutor")
    public Future<String> doTaskC() throws InterruptedException {
        System.out.println("开始执行任务C");
        long start = System.currentTimeMillis();
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println("结束任务C，耗时：" + (end-start) + "ms");
        return new AsyncResult("TaskC Done");
    }
}
