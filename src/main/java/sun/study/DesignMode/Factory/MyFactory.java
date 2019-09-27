package sun.study.DesignMode.Factory;

public class MyFactory {

    public MyInterface product(String type){

        if (type.equals("One"))
            return new MyClass1();
        else
            return new MyClass2();
    }
}
