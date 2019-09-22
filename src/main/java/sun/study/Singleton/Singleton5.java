package sun.study.Singleton;

public class Singleton5 {

    private volatile static Singleton5 INSTANCE;

    private Singleton5(){}

    public static Singleton5 getInstance(){
        if (INSTANCE == null){
            synchronized (Singleton5.class){
                if (INSTANCE == null)
                    INSTANCE = new Singleton5();
            }
        }

        return INSTANCE;
    }
}
