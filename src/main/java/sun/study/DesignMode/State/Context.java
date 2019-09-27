package sun.study.DesignMode.State;

public class Context {

    private State state;

    public Context(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method(){

        if (this.state.getValue().equals("State1"))
            this.state.method1();
        else if (this.state.getValue().equals("State2"))
            this.state.method2();
    }
}
