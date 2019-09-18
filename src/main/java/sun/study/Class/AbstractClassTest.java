package sun.study.Class;

public class AbstractClassTest extends AbstractClass{

    public static void main(String[] args){
        AbstractClassTest at = new AbstractClassTest();
        at.showHi();
        at.showMessage();
    }

    public void showMessage(){

        System.out.println("Show Message!");
    }
}
