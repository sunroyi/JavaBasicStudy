package sun.study.JavaMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {

    public static void main(String[] args){

        TreeMap<Integer, String> tm = new TreeMap();

        tm.put(3, "Royi");
        tm.put(1, "Sun");
        tm.put(2, "Alex");

        System.out.println("Entry:");
        for(Map.Entry m : tm.entrySet()) {
            System.out.println(m);
        }

        System.out.println("Iterator:");
        Iterator it = tm.entrySet().iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
