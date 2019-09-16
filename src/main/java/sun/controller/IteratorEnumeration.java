package sun.controller;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Random;

public class IteratorEnumeration {

    public static void main(String[] args){
        int val;
        Random r = new Random();
        Hashtable ht = new Hashtable();

        for (int i=0;i<10000;i++) {
            val = r.nextInt(100);
            ht.put(String.valueOf(i), val);
        }

        System.out.println("Execute Iterator:");
        IteratorHashtable(ht);

        System.out.println("Execute Enum:");
        EnumHashtable(ht);
    }

    private static void IteratorHashtable(Hashtable ht){

        long start = System.currentTimeMillis();

        Iterator it = ht.entrySet().iterator();
        while(it.hasNext()){
            it.next();
        }

        long end = System.currentTimeMillis();
        countTime(start, end);
    }

    private static void EnumHashtable(Hashtable ht){

        long start = System.currentTimeMillis();

        Enumeration em = ht.elements();
        while(em.hasMoreElements()){
            em.nextElement();
        }

        long end = System.currentTimeMillis();
        countTime(start, end);
    }

    private static void countTime(long start, long end){
        System.out.println("Time:" + (end-start) + "ms");
    }
}
