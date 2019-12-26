package sun.study.ABA;

import javax.annotation.security.RunAs;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

public class ABA {

    private static AtomicInteger atomicInt = new AtomicInteger(100);
    private static AtomicStampedReference<Integer> atomicStampedRef = new AtomicStampedReference<>(100, 0);

    public static void main(String[] args) throws InterruptedException {
        Thread T1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atomicInt.compareAndSet(100, 101);
                atomicInt.compareAndSet(101, 100);
            }
        });

        Thread T2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                boolean C3 = atomicInt.compareAndSet(100, 101);
                System.out.println(C3);
            }
        });

        T1.start();
        T2.start();
        T1.join();
        T2.join();

        Thread refT1 = new Thread(new Runnable() {
            @Override
            public void run() {

                int stamp = atomicStampedRef.getStamp();
                System.out.println("T1:"+stamp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                atomicStampedRef.compareAndSet(100, 101, stamp, stamp+1);
                System.out.println("T1:"+atomicStampedRef.getStamp());
                atomicStampedRef.compareAndSet(101, 100, stamp, stamp+1);
                System.out.println("T1:"+atomicStampedRef.getStamp());
            }
        });

        Thread refT2 = new Thread(new Runnable() {
            @Override
            public void run() {

                int stamp = atomicStampedRef.getStamp();
                System.out.println("T2:"+stamp);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T2:"+atomicStampedRef.getStamp());
                boolean C3 = atomicStampedRef.compareAndSet(100, 101, stamp, stamp+1);
                System.out.println("T2:"+atomicStampedRef.getStamp());
                System.out.println(C3);
            }
        });

        refT1.start();
        refT2.start();

    }

}
