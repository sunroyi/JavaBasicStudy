package sun.study.DesignMode2.Mediator;

public class MyTest {

    public static void main(String[] args){

        Mediator mediator = new Mediator();

        Colleague colleageA = new Colleague("A");
        Colleague colleageB = new Colleague("B");

        mediator.add("A", colleageA);
        mediator.add("B", colleageB);

        mediator.doSelf("A");
        mediator.doSelf("B");
        mediator.doOut("A");
        mediator.doOut("B");

    }
}
