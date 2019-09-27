package sun.study.DesignMode.Memento;

public class Test {

    public static void main(String[] args){

        Original original = new Original("1");

        Storage storage = new Storage(original.createMemento());

        System.out.println("原始状态：" + original.getValue());
        original.setValue("2");
        System.out.println("修改状态：" + original.getValue());

        original.restoreMemento(storage.getMemento());
        System.out.println("还原后状态：" + original.getValue());
    }
}
