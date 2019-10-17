package sun.study.DesignMode2.Command;

public class MyTest {

    public static void main(String[] args){

        Invoke invoke = new Invoke();

        Soilder s1 = new Soilder("Soilder1");
        Soilder s2 = new Soilder("Soilder2");
        invoke.add(s1);
        invoke.add(s2);

        Commander commander = new Commander();
        commander.setInvoke(invoke);
        commander.exec("Stand");

    }
}
