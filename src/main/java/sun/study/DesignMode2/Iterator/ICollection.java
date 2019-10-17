package sun.study.DesignMode2.Iterator;

public interface ICollection {

    public IIterator iterator();

    public int size();

    public Object get(int i);
}
