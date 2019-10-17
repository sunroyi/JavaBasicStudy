package sun.study.DesignMode2.Visitor;

public class Master {

    public void doSomething(Visitor1 v1){
        v1.doSomething();
    }

    public void doSomething(Visitor2 v2){
        v2.doSomething();
    }
}
