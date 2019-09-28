package sun.study.DesignMode.AbstractFactory;

public class MyClassTest {
    public static void main(String[] args){
        MyProvider mp = new MyFactory2();
        MyInterface mi = mp.product();
        mi.print();
    }
}
