package sun.study.DesignMode.Iterator;

public class MyCollection implements Collection {

    public String string[] = {"A", "B", "C", "D", "E", "F"};

    @Override
    public sun.study.DesignMode.Iterator.Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
