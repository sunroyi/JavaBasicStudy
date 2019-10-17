package sun.study.DesignMode2.Prototype;

import java.io.IOException;

public class MyTest {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        MyPrototype prototype = new MyPrototype();
        prototype.setBase(1);
        prototype.setObject(2);

        // Clone
        MyPrototype p1 = (MyPrototype)prototype.clone();
        // DeepClone
        MyPrototype p2 = (MyPrototype)prototype.deepClone();

        System.out.println("浅复制后，两个对象不一样:" + (prototype == p1));
        System.out.println("浅复制后，两个对象内部，基本类型的对象，如果值一样，则一样:" + (prototype.getBase() == p1.getBase()));
        System.out.println("浅复制后，两个对象内部，引用类型的对象，如果值一样，则一样:" + (prototype.getObject()==p1.getObject()));
        p1.setObject(3);
        System.out.println("浅复制后，两个对象内部，引用类型的对象，如果值不一样，则不一样:" + (prototype.getObject()==p1.getObject()));

        System.out.println("深复制后，两个对象不一样:" + (prototype == p2));
        System.out.println("深复制后，两个对象内部，基本类型的对象，如果值一样，则一样:" + (prototype.getBase() == p2.getBase()));
        System.out.println("深复制后，两个对象内部，引用类型的对象，即使值一样，也不一样:" + (prototype.getObject()==p2.getObject()));

    }
}
