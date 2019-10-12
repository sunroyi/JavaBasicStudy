package sun.study.DesignMode2.Bridge;

public class MsSQLDriver implements jdbc {
    @Override
    public void connect() {
        System.out.println("MsSQL Driver Connect");
    }
}
