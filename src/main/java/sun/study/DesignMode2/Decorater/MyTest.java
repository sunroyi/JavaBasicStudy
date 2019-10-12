package sun.study.DesignMode2.Decorater;

public class MyTest {

    public static void main(String[] args){

        Decorater decorater = new Decorater(new Source());
        decorater.method();

    }
}
