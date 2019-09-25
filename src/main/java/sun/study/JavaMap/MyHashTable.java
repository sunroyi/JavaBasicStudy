package sun.study.JavaMap;

import java.util.Hashtable;
import java.util.Iterator;

public class MyHashTable {

    public static void main(String[] args){

        Hashtable<String, String> ht = new Hashtable<>();

        ht.put("2", "Sun");
        ht.put("1", "Alex");
        ht.put("3", "Royi");
        ht.put("5", "Bill");
        ht.put("4", "Mark");

        Iterator it = ht.entrySet().iterator();
        while(it.hasNext())
            System.out.println(it.next());

    }
}
