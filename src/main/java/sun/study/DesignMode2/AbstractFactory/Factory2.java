package sun.study.DesignMode2.AbstractFactory;

public class Factory2 implements MyFactory {
    @Override
    public MyProduct produce() {
        return new Product2();
    }
}
