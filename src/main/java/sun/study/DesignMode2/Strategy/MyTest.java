package sun.study.DesignMode2.Strategy;

public class MyTest {

    public static void main(String[] args){

        ICalculater calculater1 = new Plus();
        System.out.println(calculater1.calculater(5,5));

        ICalculater calculater2 = new Minus();
        System.out.println(calculater2.calculater(5,5));
    }
}
