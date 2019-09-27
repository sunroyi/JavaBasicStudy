package sun.study.DesignMode.Strategy;

public class StrategyTest {

    public static void main(String[] args){

        ICalculater calc1 = new Plus();
        System.out.println(calc1.calculater(6, 3));

        ICalculater calc2 = new Minus();
        System.out.println(calc2.calculater(6, 3));

        ICalculater calc3 = new Multiply();
        System.out.println(calc3.calculater(6, 3));
    }
}
