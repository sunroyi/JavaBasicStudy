package sun.study.DesignMode.Adapter;

public class Target {

    public void show1(){
        Source s = new Source();
        s.showMessage();
    }

    public void show2(){
        System.out.println("This is different method");
    }
}
