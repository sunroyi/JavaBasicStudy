package sun.study.DesignMode.AbstractFactory;

public class MyFactory2 implements MyProvider {
    @Override
    public MyInterface product() {
        return new MyClass2();
    }
}
