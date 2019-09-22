package sun.study.Singleton;

public enum Singleton4 {
    INSTANCE;
    public void fun1(){
        System.out.println("Show Message");
    }

    public static void main(String[] args){
        Singleton4.INSTANCE.fun1();
    }
}
