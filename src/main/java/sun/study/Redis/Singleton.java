package sun.study.Redis;

public class Singleton {

    private volatile static Singleton INSTANCE;
    public volatile static int num = 0;

    private Singleton(){}

    public static Singleton GetInstance() {

        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null)
                    return new Singleton();
            }
        }

        return INSTANCE;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
