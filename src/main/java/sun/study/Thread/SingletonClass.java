package sun.study.Thread;

public class SingletonClass {

    private static SingletonClass instance =  new SingletonClass();

    private int count = 0;

    //private final AtomicInteger count = new AtomicInteger(0);

    private SingletonClass(){}

    public static SingletonClass getInstance(){
/*        if (instance == null){
            synchronized(SingletonClass.class){
                if (instance == null)
                    instance = new SingletonClass();
            }
        }*/
        return instance;
    }

    // 加了synchronized，即线程安全
    // 直接写public synchronized void plusCount()也可以
    public void plusCount(){

        //count.incrementAndGet();

        synchronized(this) {
            ++count;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        count = count++;
    }
}
