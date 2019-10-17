package sun.study.DesignMode2.Singleton;

public class Singleton5 {

    private static Singleton5 INSTANCE;

    private Singleton5(){}

    public Singleton5 GETINSTANCE(){

        if (INSTANCE == null){
            synchronized(Singleton5.class) {
                if (INSTANCE == null)
                    INSTANCE = new Singleton5();
            }
        }

        return INSTANCE;
    }

}
