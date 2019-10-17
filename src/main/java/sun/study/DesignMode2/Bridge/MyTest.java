package sun.study.DesignMode2.Bridge;

public class MyTest {

    public static void main(String[] args){

        DriverManager dm = new DriverManager();
        dm.setDriver(new MsSQLDriver());
        dm.connect();

        dm.setDriver(new OracleDriver());
        dm.connect();
    }
}
