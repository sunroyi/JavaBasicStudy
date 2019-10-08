package sun.study.Thread;

import java.util.LinkedList;
import java.util.Queue;

public class WaitTest {

    static LinkedList<String> ls = new LinkedList<>();

    volatile static int count = 0;

    // 锁
    static Object object = new Object();

    public static void main(String[] args){

        // Thread游客
        for (int i=0;i<5;i++){
            Thread ti = new Thread(new ThreadTourist(object), "T"+i);
            ti.start();
        }

        // Thread公园
        Thread tg = new Thread(new ThreadGarden(object, count), "Garden");
        tg.setDaemon(true);
        tg.start();
    }

    static class ThreadTourist implements Runnable{

        Object object;

        public ThreadTourist(Object object){
            this.object = object;
        }

        @Override
        public void run() {
                if (count >= 3) {
                    synchronized (object) {
                        try {
                            ls.add(Thread.currentThread().getName());
                            System.out.println(Thread.currentThread().getName() + " is waiting");
                            object.wait();
                            ls.remove(Thread.currentThread().getName());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

                count++;
                System.out.println(Thread.currentThread().getName() + " in, remain " + count);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count--;
                System.out.println(Thread.currentThread().getName() + " out, remain " + count);
            }
        }
    }

    class ThreadGarden implements Runnable{

        int count;
        Object object;

        public ThreadGarden(Object object, int count){
            this.object = object;
            this.count = count;
        }

        @Override
        public void run() {
            if (count<3){
                synchronized (object){
                    object.notify();
                    System.out.println("公园放行");
                }
            }
        }
    }
