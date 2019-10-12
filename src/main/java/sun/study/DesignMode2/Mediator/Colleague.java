package sun.study.DesignMode2.Mediator;

public class Colleague {

    String name;

    public Colleague(String name){
        this.name = name;
    }

    public void doSelf(){
        System.out.println(name + " do Self");
    }

    public void doOut(){
        System.out.println(name + " do Out");
    }
}
