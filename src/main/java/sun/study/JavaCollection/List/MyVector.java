package sun.study.JavaCollection.List;

import java.util.Vector;

public class MyVector {

    public static void main(String[] args){

        Vector<String> vector = new Vector<>();
        vector.add("C");
        vector.add("A");
        vector.add("B");
        vector.add("A");
        vector.add("B");
        vector.add("C");

        System.out.println(vector);

        for(int i=0;i<vector.size();i++)
            System.out.println(vector.get(i));
    }
}
