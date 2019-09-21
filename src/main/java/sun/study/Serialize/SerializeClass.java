package sun.study.Serialize;

import java.io.Serializable;

public class SerializeClass implements Serializable {
    // 没有这个，类实例化的对象不能被序列化
    private static final long serialVersionUID = 0;

    private int id;
    private String name;

    public SerializeClass(){}

    public SerializeClass(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
