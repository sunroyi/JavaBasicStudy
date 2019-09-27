package sun.study.DesignMode.Chain;

public class ChainTest {

    public static void main(String[] args){

        MyHandler h1 = new MyHandler("Handler1");
        MyHandler h2 = new MyHandler("Handler2");
        MyHandler h3 = new MyHandler("Handler3");

        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operator();
    }
}
