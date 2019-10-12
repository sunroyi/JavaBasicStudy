package sun.study.DesignMode2.Observer;

public class Observer2 implements IObserver{

    public void receive(String name){
        System.out.println("Observer2 receive from " + name);
    }
}
