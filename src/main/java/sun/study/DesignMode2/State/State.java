package sun.study.DesignMode2.State;

public class State {

    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("State1");
    }

    public void method2(){
        System.out.println("State2");
    }
}
