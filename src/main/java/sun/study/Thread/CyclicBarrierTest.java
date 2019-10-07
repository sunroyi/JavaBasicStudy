package sun.study.Thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    public static void main(String[] args){

        CyclicBarrier cb = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务组结束");
            }
        });

        for(int i=0;i<5;i++){
            new Thread(new readNum(i, cb)).start();
        }

        for(int i=11;i<16;i++){
            new Thread(new readNum(i, cb)).start();
        }
    }

    static class readNum implements Runnable{

        private int id;
        private CyclicBarrier cb;

        public readNum(int id, CyclicBarrier cb){
            this.id = id;
            this.cb= cb;
        }

        @Override
        public void run() {
            synchronized (this){
                System.out.println("id:" + id);
                try {
                    cb.await();
                    System.out.println("线程组任务" + id + "结束，其他任务继续");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
