package sun.study.DesignMode.Visitor;

public abstract class Element {

    public abstract void accept(IVisitor visitor);

    public abstract void doSomething();
}
