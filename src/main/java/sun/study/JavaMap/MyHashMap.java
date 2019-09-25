package sun.study.JavaMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args){

        HashMap<String, String> hm = new HashMap<>();

        hm.put("3", "Royi");
        hm.put("1", "Sun");
        hm.put("2", "Alex");
        hm.put("5", "Bill");
        hm.put("4", "Max");

        Iterator it = hm.entrySet().iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
