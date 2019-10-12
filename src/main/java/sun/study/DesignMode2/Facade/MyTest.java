package sun.study.DesignMode2.Facade;

public class MyTest {

    public static void main(String[] args){

        PC pc = new PC();

        pc.StarUp();
        System.out.println("------------------");
        pc.ShutDown();
    }
}
