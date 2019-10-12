package sun.study.DesignMode2.Adapter;

public class MyTest {

    public static void main(String[] args){
        Adapter adapter = new Adapter(new Source());
        adapter.method1();
        adapter.method2();
    }
}
