package sun.study.Lock;

public class SynchronizedTest3 {

    public static volatile int num = 0;

    public synchronized static void increase(){
        num++;
    }

    public static void main(String[] args){

        for(int i=0;i<1000;i++){
            Thread t = new Thread(new Runnable() {

                SynchronizedTest3 st = new SynchronizedTest3();

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
