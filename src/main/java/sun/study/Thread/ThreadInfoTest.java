package sun.study.Thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;

public class ThreadInfoTest {

    public static void main(String[] args){

        for(int i=0;i<10;i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            thread.setName("UserThread" + i);
            thread.start();
        }

        System.out.println(ManagementFactory.getThreadMXBean().getTotalStartedThreadCount());

        //final ThreadInfo[] threadInfos = ManagementFactory.getThreadMXBean().dumpAllThreads(true, true);
        final ThreadInfo[] threadInfos = ManagementFactory.getThreadMXBean().dumpAllThreads(false, false);

        for(ThreadInfo threadInfo:threadInfos){
            System.out.println(threadInfo.toString());
        }
    }
}
