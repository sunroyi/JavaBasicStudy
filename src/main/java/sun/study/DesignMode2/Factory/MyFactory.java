package sun.study.DesignMode2.Factory;

public class MyFactory {

    public void Print(String type){
        if (type.equals("1"))
            (new MyClass1()).print();
        else if (type.equals("2"))
            (new MyClass2()).print();
        else
            System.out.println("No Class ");
    }
}
