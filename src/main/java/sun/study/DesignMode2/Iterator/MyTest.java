package sun.study.DesignMode2.Iterator;

public class MyTest {

    public static void main(String[] args){

        MyCollection mc = new MyCollection();
        mc.add("A");
        mc.add("B");
        mc.add("C");
        mc.add("D");
        mc.add("E");

        MyIterator mi = new MyIterator(mc);
        while (mi.hasNext())
            System.out.println(mi.next());
    }
}
