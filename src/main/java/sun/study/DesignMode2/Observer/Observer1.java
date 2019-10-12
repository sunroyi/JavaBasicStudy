package sun.study.DesignMode2.Observer;

public class Observer1 implements IObserver{

    public void receive(String name){
        System.out.println("Observer1 receive from " + name);
    }
}
