package sun.study.DesignMode.State;

public class Test {

    public static void main(String[] args){
        State s = new State();
        Context c = new Context(s);

        s.setValue("State1");
        c.method();

        s.setValue("State2");
        c.method();
    }
}
