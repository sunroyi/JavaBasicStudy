package sun.study.DesignMode2.Singleton;

public class Singleton4 {

    public static class subclass{
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4(){}

    public Singleton4 GETINSTANCE(){
        return subclass.INSTANCE;
    }
}
