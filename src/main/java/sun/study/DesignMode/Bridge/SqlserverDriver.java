package sun.study.DesignMode.Bridge;

public class SqlserverDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("SQL Server Driver");
    }
}
