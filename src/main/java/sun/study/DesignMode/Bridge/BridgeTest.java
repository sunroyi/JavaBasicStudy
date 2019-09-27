package sun.study.DesignMode.Bridge;

public class BridgeTest {

    public static void main(String[] args){
        Driver oracle = new OracleDriver();
        Driver sqlserver = new SqlserverDriver();
        MyDriverManager dm = new MyDriverManager();

        dm.setDriver(oracle);
        dm.connect();

        dm.setDriver(sqlserver);
        dm.connect();
    }
}
