package sun.study.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SleepTest{

    static Lock lock = new ReentrantLock();

    static class SleepThread implements Runnable{

        int count = 0;
        Lock lock;

        public SleepThread(Lock lock){
            this.lock = lock;
        }

        @Override
        public void run() {
            lock.lock();
            while (count < 10) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + ":" + count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
            }
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // sleep测试结果：
        // sleep不会释放锁，但是会释放CPU资源，线程状态变成Runnable
        Thread sleepThread1 = new Thread(new SleepThread(lock));
        Thread sleepThread2 = new Thread(new SleepThread(lock));

        sleepThread1.start();
        sleepThread2.start();
    }
}
