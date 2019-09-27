package sun.study.DesignMode.Prototype;

import java.io.IOException;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        Prototype pt = new Prototype();
        pt.setBase(1);
        pt.setObj(new Integer(2));

        Prototype p1 = (Prototype) pt.shallowClone();
        Prototype p2 = (Prototype) pt.deepClone();

        System.out.println(p1.getObj() == pt.getObj());
        System.out.println(p2.getObj() == pt.getObj());
    }
}
