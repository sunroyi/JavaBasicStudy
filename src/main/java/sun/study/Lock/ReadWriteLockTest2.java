package sun.study.Lock;

import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest2 {

    public static void main(String[] args){

        MyData data = new MyData();

        for(int i=0;i<5;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    data.setData(new Random().nextInt(100));
                }
            });
            thread.start();
        }


        for(int i=0;i<5;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    data.getData();
                }
            });
            thread.start();
        }
    }

}

class MyData{

    private int Data;
    private ReadWriteLock rwl = new ReentrantReadWriteLock();

    public int getData() {

        rwl.readLock().lock();

        System.out.println(Thread.currentThread().getName() + "开始读取数据");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "获取数据:" + Data);

        System.out.println(Thread.currentThread().getName() + "结束读取数据");

        rwl.readLock().unlock();

        return Data;
    }

    public void setData(int data) {

        rwl.writeLock().lock();

        System.out.println(Thread.currentThread().getName() + "开始写入数据");

        try {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + "写入数据:" + Data + "->" + data);
            Data = data;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "结束写入数据");

        rwl.writeLock().unlock();
    }
}
