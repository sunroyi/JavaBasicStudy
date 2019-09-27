package sun.study.DesignMode.Decorater;

public class Decorater implements Sourceable{

    private Sourceable s;

    public Decorater(Sourceable source){
        s = source;
    }

    @Override
    public void method() {
        System.out.println("Before Method");
        s.method();
        System.out.println("After Method");
    }
}
