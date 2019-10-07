package sun.study.AsyncTaskExecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SyncTest {
    @Autowired
    private SyncTask syncTask;

    @Test
    public void testSyncTask() throws InterruptedException {
        System.out.println("开始测试SyncTask");
        long start = System.currentTimeMillis();
        syncTask.doTaskA();
        syncTask.doTaskB();
        syncTask.doTaskC();
        long end = System.currentTimeMillis();
        System.out.println("结束测试SyncTask，耗时：" + (end-start) + "ms");
    }

}
