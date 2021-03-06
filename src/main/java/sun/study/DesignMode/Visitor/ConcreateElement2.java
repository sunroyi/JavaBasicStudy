package sun.study.DesignMode.Visitor;

public class ConcreateElement2 extends Element {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doSomething() {
        System.out.println("Element2 do something");
    }
}
