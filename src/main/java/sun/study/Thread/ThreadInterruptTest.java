package sun.study.Thread;

public class ThreadInterruptTest {
    public static void main(String[] args){
        final Thread sleepThread = new Thread(){
            @Override
            public void run(){
                try{
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                super.run();
            }
        };

        Thread busyThread = new Thread(){
            @Override
            public void run(){
                while(true);
            }
        };

        sleepThread.start();
        busyThread.start();
        sleepThread.interrupt();
        busyThread.interrupt();
        System.out.println("sleepThread.isInterrupted:" + sleepThread.isInterrupted());
        System.out.println("busyThread.isInterrupted:" + busyThread.isInterrupted());
        System.out.println(sleepThread.isAlive());
        System.out.println(busyThread.isAlive());
    }
}
