package sun.study.AsyncTaskExecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AsyncTest {
    @Autowired
    private AsyncTask asyncTask;

    @Test
    public void testSyncTask() throws InterruptedException {
        System.out.println("开始测试AsyncTask");
        long start = System.currentTimeMillis();
        Future<String> r1 = asyncTask.doTaskA();
        Future<String> r2 = asyncTask.doTaskB();
        Future<String> r3 = asyncTask.doTaskC();

        while(true){
            if (r1.isDone() && r2.isDone() && r3.isDone())
                break;

            Thread.sleep(100);
        }

        long end = System.currentTimeMillis();
        System.out.println("结束测试AsyncTask，耗时：" + (end-start) + "ms");
    }

}
