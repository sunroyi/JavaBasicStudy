package sun.study.Singleton;

public class Singleton3 {
    private static class subClass{
        private static final Singleton3 instance = new Singleton3();
    }

    private Singleton3(){};

    public static final Singleton3 getInsatnce(){
        return subClass.instance;
    }
}
