package sun.study.DesignMode2.State;

public class Subject {

    State state;

    public Subject(State state){
        this.state = state;
    }

    public void setState(String value){
        state.setValue(value);
    }

    public String getState(){
        return state.getValue();
    }

    public void method(){
        if (state.getValue().equals("1"))
            state.method1();
        else if (state.getValue().equals("2"))
            state.method2();
        else
            System.out.println("No State");
    }
}
