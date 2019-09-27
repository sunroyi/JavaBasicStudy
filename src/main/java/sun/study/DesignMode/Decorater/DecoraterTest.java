package sun.study.DesignMode.Decorater;

public class DecoraterTest {

    public static void main(String[] args){
        Sourceable sa = new Source();
        Sourceable obj = new Decorater(sa);
        obj.method();
    }
}
