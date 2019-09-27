package sun.study.DesignMode.Factory;

public class MyClassTest {

    public static void main(String[] args){

        MyFactory mf = new MyFactory();
        MyInterface mi = mf.product("Two");
        mi.print();
    }
}
