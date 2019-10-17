package sun.study.DesignMode2.Adapter;

public class Adapter {
    Source source;

    public Adapter(Source source){
        this.source = source;
    }

    public void method1(){
        System.out.println("Adapter method1:");
        source.method1();
    }

    public void method2(){
        System.out.println("Adapter method2:");
        source.method2();
    }
}
