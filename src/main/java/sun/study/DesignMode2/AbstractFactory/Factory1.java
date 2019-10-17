package sun.study.DesignMode2.AbstractFactory;

public class Factory1 implements MyFactory {
    @Override
    public MyProduct produce() {
        return new Product1();
    }
}
