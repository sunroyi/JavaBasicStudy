package sun.study.DesignMode.Proxy;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("Original Method");
    }
}
