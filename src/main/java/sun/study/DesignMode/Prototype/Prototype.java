package sun.study.DesignMode.Prototype;

import java.io.*;

public class Prototype implements Cloneable, Serializable {

    private static final long serialVersionID = 1L;

    private int base;

    private Integer obj;

    public Object shallowClone() throws CloneNotSupportedException {
        Prototype pt = (Prototype)super.clone();
        return pt;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {

        // Write Stream From this Object
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // Read Stream From new Object
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public Integer getObj() {
        return obj;
    }

    public void setObj(Integer obj) {
        this.obj = obj;
    }
}
