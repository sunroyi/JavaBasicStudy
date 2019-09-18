package sun.study.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockClass {
    private static LockClass instance = new LockClass();

    private int count=0;

    private LockClass(){}

    public static LockClass getInstance(){
        return instance;
    }

    Lock lock = new ReentrantLock();

    public void plusCount(){
        lock.lock();

        try {
            //System.out.println(thread.getName() + "得到了锁");
            ++count;
        }catch(Exception ex){

        }finally {
            //System.out.println(thread.getName() + "释放了锁");
            lock.unlock();
        }
    }

    public int getCount(){
        return count;
    }
}
