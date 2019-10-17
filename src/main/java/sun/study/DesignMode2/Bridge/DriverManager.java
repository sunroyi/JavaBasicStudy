package sun.study.DesignMode2.Bridge;

public class DriverManager {

    jdbc driver;

    public void setDriver(jdbc driver){
        this.driver = driver;
    }

    public void connect(){
        driver.connect();
    }
}
