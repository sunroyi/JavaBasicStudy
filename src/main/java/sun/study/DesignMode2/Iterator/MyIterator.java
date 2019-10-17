package sun.study.DesignMode2.Iterator;

import sun.study.DesignMode.Iterator.Collection;

public class MyIterator implements IIterator {

    private ICollection collection;
    private int pos = -1;

    public MyIterator(ICollection collection){
        this.collection = collection;
    }

    @Override
    public Object next() {

        if (pos < collection.size()-1)
            pos++;

        return collection.get(pos);
    }

    @Override
    public Object previous() {
        if (pos > 0)
            pos--;

        return collection.get(pos);
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {

        if (pos < collection.size()-1)
            return true;
        else
            return false;
    }
}
