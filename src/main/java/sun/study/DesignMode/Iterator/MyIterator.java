package sun.study.DesignMode.Iterator;

public class MyIterator implements Iterator {

    private Collection collection;
    private int pos = -1;

    public MyIterator(Collection c){
        this.collection = c;
    }

    @Override
    public Object previous() {

        if (pos > 0)
            pos --;

        return collection.get(pos);
    }

    @Override
    public Object next() {

        if (pos < collection.size()-1)
            pos ++;

        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if (pos < collection.size()-1)
            return true;
        else
            return false;
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}
