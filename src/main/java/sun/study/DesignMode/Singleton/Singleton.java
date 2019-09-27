package sun.study.DesignMode.Singleton;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton(){}

    public static Singleton newInstance(){
        if (INSTANCE == null)
            INSTANCE = new Singleton();

        return INSTANCE;
    }
}
