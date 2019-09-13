package sun.controller;

import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {
    public static void main(String[] args){

        final Data data = new Data();

        for(int i=0;i<3;i++) {
            new Thread() {
                public void run(){
                    for(int j=0;j<5;j++){
                        data.set(new Random().nextInt(30));
                    }
                }
            }.start();
        }

        for(int i=0;i<3;i++) {
            new Thread() {
                public void run(){
                    for(int j=0;j<5;j++){
                        data.get();
                    }
                }
            }.start();
        }
    }
}

class Data{

    private ReadWriteLock rwl = new ReentrantReadWriteLock();
    private int Data;

    public void set(int data){

        rwl.writeLock().lock();

        try {
            System.out.println(Thread.currentThread().getName() + "写入数据");

            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }

            this.Data = data;

            System.out.println(Thread.currentThread().getName() + "写入" + this.Data);
        }finally {
            rwl.writeLock().unlock();
        }
    }

    public void get(){

        rwl.readLock().lock();

        try {
            System.out.println(Thread.currentThread().getName() + "读取数据");

            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "读取" + this.Data);

        }finally {
            rwl.readLock().unlock();
        }
    }
}