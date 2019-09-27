package sun.study.DesignMode.Command;

public class MyCommand implements Command {

    private Receiver receiver;
    private String action;

    public MyCommand(Receiver receiver, String action){
        this.receiver = receiver;
        this.action = action;
    }

    @Override
    public void exec() {
        receiver.action(action);
    }
}
