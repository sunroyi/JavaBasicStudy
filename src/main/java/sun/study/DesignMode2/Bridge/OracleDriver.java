package sun.study.DesignMode2.Bridge;

public class OracleDriver implements jdbc {
    @Override
    public void connect() {
        System.out.println("Oracle Driver Connect");
    }
}
