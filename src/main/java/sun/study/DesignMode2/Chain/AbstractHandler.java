package sun.study.DesignMode2.Chain;

public abstract class AbstractHandler {

    private IHandler handler;

    public IHandler getHandler() {
        return handler;
    }

    public void setHandler(IHandler handler) {
        this.handler = handler;
    }
}
