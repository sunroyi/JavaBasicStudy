package sun.study.DesignMode2.Memento;

public class Origin {

    String value;

    public Origin(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memory createMemory(){
        return new Memory(value);
    }

    public void restoreMemory(Memory memory){
        setValue(memory.getValue());
    }
}
