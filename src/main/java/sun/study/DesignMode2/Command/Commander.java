package sun.study.DesignMode2.Command;

public class Commander {

    Invoke invoke;

    public Invoke getInvoke() {
        return invoke;
    }

    public void setInvoke(Invoke invoke) {
        this.invoke = invoke;
    }

    public void exec(String command){
        invoke.exec(command);
    }
}
