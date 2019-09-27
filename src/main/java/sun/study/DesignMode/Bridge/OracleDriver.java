package sun.study.DesignMode.Bridge;

public class OracleDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("Oracle Connect");
    }
}
