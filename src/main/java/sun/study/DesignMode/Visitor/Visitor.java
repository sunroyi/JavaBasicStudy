package sun.study.DesignMode.Visitor;

public class Visitor implements IVisitor {
    @Override
    public void visit(ConcreateElement1 e1) {
        e1.doSomething();
    }

    @Override
    public void visit(ConcreateElement2 e2) {
        e2.doSomething();
    }
}
