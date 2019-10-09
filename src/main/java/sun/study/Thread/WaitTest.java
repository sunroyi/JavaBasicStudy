package sun.study.Thread;

import java.util.LinkedList;
import java.util.Queue;

public class WaitTest {

    public static void main(String[] args) {

        LinkedList<String> inList = new LinkedList<>();

        // Thread游客
        for (int i = 0; i < 7; i++) {
            Thread ti = new Thread(new ThreadTourist(inList), "T" + i);
            ti.start();
        }

        // Thread公园
        Thread tg = new Thread(new ThreadGarden(inList), "Garden");
        tg.setDaemon(true);
        tg.start();
    }

    static class ThreadTourist implements Runnable {

        LinkedList<String> inList;

        public ThreadTourist(LinkedList<String> inList){
            this.inList = inList;
        }

        @Override
        public void run() {

            synchronized (inList) {
                if (inList.size() >= 3) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " is waiting");
                        inList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                inList.add(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName() + " in, " + inList.size() + " still in garden.");

                Thread threadOut = new Thread(new ThreadOut(inList), "TOut-" + Thread.currentThread().getName());
                threadOut.start();
            }
        }
    }

    static class ThreadOut implements Runnable {

        LinkedList<String> inList;

        public ThreadOut(LinkedList<String> inList){
            this.inList = inList;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (inList) {
                inList.remove(Thread.currentThread().getName().replace("TOut-", ""));
                System.out.println(Thread.currentThread().getName().replace("TOut-", "") + " out, " + inList.size() + " still in garden.");
            }
        }
    }

    static class ThreadGarden implements Runnable {

        LinkedList<String> inList;

        public ThreadGarden(LinkedList<String> inList){
            this.inList = inList;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (inList) {
                    if (inList.size() < 3) {
                        inList.notify();
                        System.out.println("公园放行");
                    }
                }
            }
        }
    }
}
