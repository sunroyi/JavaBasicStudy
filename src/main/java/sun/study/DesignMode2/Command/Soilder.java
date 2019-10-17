package sun.study.DesignMode2.Command;

public class Soilder {

    String name;

    public Soilder(String name){
        this.name = name;
    }

    public void exec(String command){
        System.out.println(name + " Execuute " + command);
    }
}
