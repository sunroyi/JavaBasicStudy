package sun.study.DesignMode.Command;

import java.lang.reflect.InvocationHandler;

public class CommandTest {

    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver, "Run");
        Invoker invoker = new Invoker(command);

        invoker.action();
    }
}
