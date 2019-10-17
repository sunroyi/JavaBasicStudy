package sun.study.DesignMode2.Chain;

public class MyHandler extends AbstractHandler implements IHandler {

    String name;

    public MyHandler(String name){
        this.name = name;
    }

    @Override
    public void deal() {
        System.out.println(name + " deal");

        IHandler handler = getHandler();
        if (handler != null)
            handler.deal();
    }
}
