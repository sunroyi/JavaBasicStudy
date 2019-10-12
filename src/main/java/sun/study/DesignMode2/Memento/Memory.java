package sun.study.DesignMode2.Memento;

public class Memory {

    String value;

    public Memory(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
