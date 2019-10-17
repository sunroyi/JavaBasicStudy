package sun.study.DesignMode2.Decorater;

public class Decorater implements SourceInterface {

    SourceInterface source;

    public Decorater(SourceInterface source){
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("Decorater Before");
        source.method();
        System.out.println("Decorater After");
    }
}
