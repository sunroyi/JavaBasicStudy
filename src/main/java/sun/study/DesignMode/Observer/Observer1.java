package sun.study.DesignMode.Observer;

public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer1 has received!");
    }
}
