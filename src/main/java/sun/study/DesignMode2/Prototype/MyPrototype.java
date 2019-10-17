package sun.study.DesignMode2.Prototype;

import java.io.*;

public class MyPrototype implements Serializable, Cloneable {

    private static final long serializeUID = 1L;

    private int base;
    private Integer object;

    public Object clone() throws CloneNotSupportedException {
        MyPrototype prototype = (MyPrototype)super.clone();
        return prototype;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public Integer getObject() {
        return object;
    }

    public void setObject(Integer object) {
        this.object = object;
    }
}
