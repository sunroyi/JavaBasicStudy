package sun.study.DesignMode2.Visitor;

public class MyTest {

    public static void main(String[] args){

        Master master = new Master();

        master.doSomething(new Visitor1());
        master.doSomething(new Visitor2());
    }
}
