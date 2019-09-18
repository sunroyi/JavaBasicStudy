package sun.study.Thread;

public class ThreadSleepWaitTest {

    public static void main(String[] args){
        new Thread(new threadSleep()).start();
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new threadWait()).start();
    }

    private static class threadSleep implements Runnable{

        @Override
        public void run() {
            synchronized (ThreadSleepWaitTest.class){
                System.out.println("Enter ThreadSleep...");
                System.out.println("ThreadSleep is waiting...");

                try{
                    ThreadSleepWaitTest.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("ThreadSleep is going on...");
                System.out.println("ThreadSleep is over!");
            }
        }
    }

    private static class threadWait implements Runnable{

        @Override
        public void run() {
            synchronized (ThreadSleepWaitTest.class){
                System.out.println("Enter ThreadWait...");
                System.out.println("ThreadWait is sleeping...");

                try{
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("ThreadWait is going on...");
                System.out.println("ThreadWait is over!!!");
                ThreadSleepWaitTest.class.notify(); // 如果没有notify，那么用了wait的地方将会永远挂起。
            }
        }
    }

}
