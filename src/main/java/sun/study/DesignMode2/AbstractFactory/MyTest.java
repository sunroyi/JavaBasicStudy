package sun.study.DesignMode2.AbstractFactory;

public class MyTest {

    public static void main(String[] agrs){

        MyFactory factory1 = new Factory1();
        MyProduct product1 = factory1.produce();
        product1.print();

        MyFactory factory2 = new Factory2();
        MyProduct product2 = factory2.produce();
        product2.print();
    }
}
