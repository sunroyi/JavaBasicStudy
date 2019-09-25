package sun.study.JavaCollection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("1");
        list.add("2");
        System.out.println(list);

        System.out.println("---------------------");

        String[] ss = list.toArray(new String[list.size()]);
        for(String s:ss)
            System.out.println(s);

        System.out.println("---------------------");

        List<String> sList = Arrays.asList(ss);

        System.out.println(sList);
    }
}
