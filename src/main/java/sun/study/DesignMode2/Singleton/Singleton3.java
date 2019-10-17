package sun.study.DesignMode2.Singleton;

public enum Singleton3 {
    INSTANCE;

    public void print(){
        System.out.println("Print");
    }

    public static void main(String[] args){
        Singleton3.INSTANCE.print();
    }
}
