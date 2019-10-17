package sun.study.DesignMode2.Flyweight;

public class Factory {

    private String name = " My Factory ";
    private String version = " 1.0 ";

    public void product(String product){
        System.out.println(name + version + " made " + product);
    }
}
