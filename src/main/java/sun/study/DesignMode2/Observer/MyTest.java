package sun.study.DesignMode2.Observer;

public class MyTest {

    public static void main(String[] args){

        Subject subject = new Subject();
        subject.addObserver(new Observer1());
        subject.addObserver(new Observer2());
        subject.update();
    }
}
