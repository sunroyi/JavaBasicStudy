package sun.study.Lock;

public class SynchronizedTest2 {

    public static volatile int num = 0;

    public synchronized void increase(){
        num++;
    }

    public static void main(String[] args){

        for(int i=0;i<1000;i++){
            Thread t = new Thread(new Runnable() {

                SynchronizedTest2 st = new SynchronizedTest2();

                @Override
                public void run() {
                    for(int i=0;i<1000;i++)
                        st.increase();
                }
            });

            t.start();
        }

        while(Thread.activeCount()>1)
            Thread.yield();

        System.out.println(num);
    }

}
