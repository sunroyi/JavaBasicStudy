package sun.study.DesignMode2.Memento;

public class MyTest {

    public static void main(String[] args){

        Origin origin = new Origin("1");
        System.out.println("修改前：" + origin.getValue());

        Memory memory = origin.createMemory();
        origin.setValue("2");
        System.out.println("修改后：" + origin.getValue());

        origin.restoreMemory(memory);
        System.out.println("重置后：" + origin.getValue());
    }
}
