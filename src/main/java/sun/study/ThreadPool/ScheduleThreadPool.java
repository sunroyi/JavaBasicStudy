package sun.study.ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPool {

    public static class TimerTask implements Runnable{

        private String id;

        public TimerTask(String id){
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println(id + " is running");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);

        ScheduledFuture sfa = ses.scheduleWithFixedDelay(new TimerTask("A"), 100, 1000, TimeUnit.MILLISECONDS);
        ScheduledFuture sfb = ses.scheduleWithFixedDelay(new TimerTask("B"), 100, 1000, TimeUnit.MILLISECONDS);
        ScheduledFuture sfc = ses.scheduleWithFixedDelay(new TimerTask("C"), 100, 1000, TimeUnit.MILLISECONDS);

        Thread.sleep(5000);
        sfa.cancel(true);

        Thread.sleep(5000);
        ses.shutdown();

        System.out.println("Finish");
    }
}
