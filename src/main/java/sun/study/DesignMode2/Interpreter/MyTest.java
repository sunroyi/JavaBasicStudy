package sun.study.DesignMode2.Interpreter;

public class MyTest {

    public static void main(String[] args){

        System.out.println((new Multi()).calc((new Plus()).calc(2,4),6));
    }
}
