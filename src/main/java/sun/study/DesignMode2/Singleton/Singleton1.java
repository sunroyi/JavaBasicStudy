package sun.study.DesignMode2.Singleton;

public class Singleton1 {

    private static Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){}

    public Singleton1 GETINSTANCE(){
        return INSTANCE;
    }
}
