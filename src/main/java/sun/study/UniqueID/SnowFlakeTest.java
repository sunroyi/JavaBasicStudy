package sun.study.UniqueID;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SnowFlakeTest{

    public static void main(String[] args) {
        SnowFlakeIdGenerator generator = new SnowFlakeIdGenerator(1, 1);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    long id = generator.nextId();
                    System.out.println(id);
                }
            });
        }
        executorService.shutdown();
    }
}
