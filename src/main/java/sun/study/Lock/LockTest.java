package sun.study.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args){
        Outputter1 output = new Outputter1();
        new Thread(){
            public void run(){
                output.output("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
            }
        }.start();
        new Thread(){
            public void run(){
                output.output("222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
            }
        }.start();
        //System.exit(0);
    }
}

class Outputter1{
    //private Lock lock = new ReentrantLock();

    public void output(String name){
        //lock.lock();
        synchronized(this) {
            try {
                for (int i = 0; i < name.length(); i++) {
                    System.out.print(name.charAt(i));
                }

            } finally {
                //lock.unlock();
            }
        }
    }

}

