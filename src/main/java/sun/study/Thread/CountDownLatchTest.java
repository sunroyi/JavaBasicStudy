package sun.study.Thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch cdl = new CountDownLatch(5);

        for(int i=0;i<5;i++){
            new Thread(new readNum(i, cdl)).start();
        }

        cdl.await();
        System.out.println("线程执行结束");
    }

    static class readNum implements Runnable{

        private int id;
        private CountDownLatch cdl;

        public readNum(int id, CountDownLatch cdl){
            this.id = id;
            this.cdl = cdl;
        }

        @Override
        public void run() {
            synchronized (this){
                System.out.println("id:" + id);
                cdl.countDown();
                System.out.println("线程组任务" + id + "结束，其他任务继续");
            }
        }
    }
}
