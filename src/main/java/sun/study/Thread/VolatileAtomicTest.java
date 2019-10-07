package sun.study.Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileAtomicTest {

    public volatile static int vCount = 0;
    public static AtomicInteger aCount;

    static class taskVolatile implements Runnable{

        private AtomicInteger count;

        public taskVolatile(AtomicInteger count){
            this.count = count;
        }

        @Override
        public void run() {
            for(int i=0;i<5;i++)
                System.out.println(vCount++);
        }
    }

    static class taskAtomic implements Runnable{

        private AtomicInteger count;

        public taskAtomic(AtomicInteger count){
            this.count = count;
        }

        @Override
        public void run() {
            for(int i=0;i<5;i++)
                System.out.println(count.incrementAndGet());
        }
    }

    public static void main(String[] args){

        aCount = new AtomicInteger();
        aCount.set(0);

        for(int i=0;i<10;i++){
            //new Thread(new taskVolatile(vCount)).start();
            new Thread(new taskAtomic(aCount)).start();
        }

    }
}
