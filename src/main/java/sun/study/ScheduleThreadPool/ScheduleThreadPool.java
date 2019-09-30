package sun.study.ScheduleThreadPool;

import java.util.Date;
import java.util.concurrent.*;

public class ScheduleThreadPool {

    static class TimerTask implements Runnable{

        private String id;

        public TimerTask(String id){
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println(new Date() + " " + id + " Running");
        }
    }

    public static void main(String[] args){

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);

        // 定时任务，开始延迟200ms，间隔周期1000ms
        ScheduledFuture sa = ses.scheduleAtFixedRate(new TimerTask("A"), 200, 1000, TimeUnit.MILLISECONDS);
        ScheduledFuture sb = ses.scheduleAtFixedRate(new TimerTask("B"), 400, 1000, TimeUnit.MILLISECONDS);
        ScheduledFuture sc = ses.scheduleAtFixedRate(new TimerTask("C"), 600, 1000, TimeUnit.MILLISECONDS);
        ScheduledFuture sd = ses.scheduleAtFixedRate(new TimerTask("D"), 800, 1000, TimeUnit.MILLISECONDS);

        try {
            // 5秒后，关闭任务sa
            Thread.sleep(5000);
            sa.cancel(true);

            // 5秒后，关闭线程池结束所有任务
            Thread.sleep(5000);
            ses.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
