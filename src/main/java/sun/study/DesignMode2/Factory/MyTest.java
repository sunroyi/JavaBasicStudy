package sun.study.DesignMode2.Factory;

public class MyTest {

    public static void main(String[] args){
        MyFactory factory = new MyFactory();
        factory.Print("1");
        factory.Print("2");
        factory.Print("3");
    }
}
