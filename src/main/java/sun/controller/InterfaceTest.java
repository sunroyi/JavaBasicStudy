package sun.controller;

public class InterfaceTest extends AbstractClass implements Interface1, Interface2 {

    public void drive(){
        System.out.println("Drive car of " + Interface1.color);
    }

    public void drive2(){
        System.out.println("Drive car of " + Interface2.color);
    }

    public void showMessage(){
        System.out.println("showMessage");
    }

    public static void main(String[] args){
        InterfaceTest it = new InterfaceTest();
        it.drive();
        it.drive2();
        it.showMessage();
    }
}
