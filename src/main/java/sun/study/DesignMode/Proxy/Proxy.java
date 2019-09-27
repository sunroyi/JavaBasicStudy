package sun.study.DesignMode.Proxy;

public class Proxy implements Sourceable {

    private Source s;

    public Proxy(){
        s = new Source();
    }

    @Override
    public void method() {
        before();
        s.method();
        after();
    }

    private void before(){
        System.out.println("Before Method");
    }

    private void after(){
        System.out.println("End Method");
    }
}
