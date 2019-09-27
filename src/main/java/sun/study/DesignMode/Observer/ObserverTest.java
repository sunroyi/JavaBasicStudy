package sun.study.DesignMode.Observer;

public class ObserverTest {

    public static void main(String[] args){
        MySubject ms = new MySubject();
        ms.add(new Observer1());
        ms.add(new Observer2());

        ms.operation();
    }
}
