package sun.study.Class;

import java.util.ArrayList;

public class GenericsClassTest {

    public static void main(String[] args){

        ArrayList<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");

        GenericsClass<ArrayList> gc = new GenericsClass<>(al);

        gc.showName1(new MyClass1());
        gc.showName2(new ArrayList());
        gc.showName3();
        GenericsClass.showName4(new MyClass2());
    }
}
