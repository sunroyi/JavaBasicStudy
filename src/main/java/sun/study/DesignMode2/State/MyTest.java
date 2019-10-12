package sun.study.DesignMode2.State;

public class MyTest {

    public static void main(String[] args){

        Subject subject = new Subject(new State());
        subject.setState("1");
        subject.method();

        subject.setState("2");
        subject.method();

        subject.setState("3");
        subject.method();
    }
}
