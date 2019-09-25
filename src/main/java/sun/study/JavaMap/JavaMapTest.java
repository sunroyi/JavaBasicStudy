package sun.study.JavaMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class JavaMapTest implements Runnable {

    HashMap clshm;
    Hashtable clsht;
    ConcurrentHashMap clschm;

    public static void main(String[] args){

        HashMap hm = new HashMap();
        hm.put("1", "Alex");
        hm.put("2", "Royi");
        hm.put("3", "Steven");
        hm.put(null, null);
        hm.put("4", null);
        hm.put("5", null);
        //hm.put(null, "Tom");
        System.out.println(hm);

        Hashtable ht = new Hashtable();
        ht.put("1", "Alex");
        ht.put("2", "Royi");
        ht.put("3", "Steven");
        //ht.put(null, null);       // Error
        //ht.put("4", null);       // Error
        //ht.put("5", null);       // Error
        //ht.put(null, "Tom");       // Error
        System.out.println(ht);

        ConcurrentHashMap chm = new ConcurrentHashMap();
        chm.put("1", "Alex");
        chm.put("2", "Royi");
        chm.put("3", "Steven");
        //chm.put(null, null);       // Error
        //chm.put("4", null);       // Error
        //chm.put("5", null);       // Error
        System.out.println(chm);

/*        for (int i=0;i<10;i++){
            Thread thread = new Thread(new JavaMapTest(hm, ht, chm));
            thread.start();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(hm.size());
        System.out.println(ht.size());
        System.out.println(chm.size());*/

    }

    public JavaMapTest(HashMap hm, Hashtable ht, ConcurrentHashMap chm){
        clshm = hm;
        clsht = ht;
        clschm = chm;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            clshm.put(Thread.currentThread().getName() + i, i);
            clsht.put(Thread.currentThread().getName() + i, i);
            clschm.put(Thread.currentThread().getName() + i, i);
        }
    }
}
