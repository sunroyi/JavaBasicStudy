package sun.study.DesignMode2.Iterator;

import java.util.ArrayList;
import java.util.List;

public class MyCollection implements ICollection {

    List<String> list;

    public MyCollection(){
        list = new ArrayList<>();
    }

    public void add(String str){
        list.add(str);
    }

    @Override
    public IIterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Object get(int i) {
        return list.get(i);
    }
}
