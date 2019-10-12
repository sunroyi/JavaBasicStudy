package sun.study.DesignMode2.Proxy;

public class Proxy {

    Source source;

    public Proxy(){
        this.source = new Source();
    }

    public void proxyMethod(){
        System.out.println("Proxy Before");
        source.method();
        System.out.println("Proxy After");
    }
}
