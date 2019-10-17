package sun.study.DesignMode2.Singleton;

public class Singleton2 {
    private static Singleton2 INSTANCE;

    private Singleton2(){}

    public Singleton2 GETINSTANCE(){
        if (INSTANCE == null)
            INSTANCE = new Singleton2();

        return INSTANCE;
    }
}
