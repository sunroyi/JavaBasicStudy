package sun.study.DesignMode.Observer;

public class MySubject extends AbstractSubject {


    @Override
    public void operation() {
        System.out.println("My Operation");
        notifyObservers();
    }
}
