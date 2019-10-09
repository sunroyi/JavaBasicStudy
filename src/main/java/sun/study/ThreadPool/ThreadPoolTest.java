package sun.study.ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolTest {

    public static void main(String[] args) throws InterruptedException {

        RejectedExcutionHandlerImpl reject = new RejectedExcutionHandlerImpl();
        ThreadFactory factory = Executors.defaultThreadFactory();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 5, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(2), factory, reject);

        MonitorThread monitor = new MonitorThread(pool, 3);
        Thread mThread = new Thread(monitor);
        mThread.start();

        for(int i=0;i<10;i++){
            pool.execute(new WorkerThread("cmd" + i));
        }

        Thread.sleep(30000);
        pool.shutdown();
        Thread.sleep(5000);
        monitor.shutdown();
    }
}
