package sun.study.JavaCollection;

import java.util.*;

public class JavaCollectionTest implements Runnable {

    ArrayList<String> clsList;
    HashSet<String> clsSet;
    Vector<String> clsVector;
    LinkedList<String> clsLl;

    public static void main(String[] args){
        String str1 = "Steven";
        String str2 = "Alex";
        String str3 = "Vetor";

        ArrayList<String> list = new ArrayList<String>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str3);
        list.add(str2);
        list.add(str1);
        System.out.println(list);

        HashSet<String> set = new HashSet<>();
        set.add(str1);
        set.add(str2);
        set.add(str3);
        set.add(str3);
        set.add(str2);
        set.add(str1);
        System.out.println(set);

        Vector<String> vector = new Vector<>();
        vector.add(str1);
        vector.add(str2);
        vector.add(str3);
        vector.add(str3);
        vector.add(str2);
        vector.add(str1);
        System.out.println(vector);

        LinkedList<String> ll = new LinkedList<>();
        ll.add(str1);
        ll.add(str2);
        ll.add(str3);
        ll.add(str3);
        ll.add(str2);
        ll.add(str1);
        System.out.println(ll);

        for(int i=0;i<10;i++){
            Thread thread = new Thread(new JavaCollectionTest(list, set, vector, ll));
            thread.setName("T" + i);
            thread.start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());
        System.out.println(set.size());
        System.out.println(vector.size());
        System.out.println(ll.size());

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.push("1");
        linkedList1.push("2");
        linkedList1.push("3");
        linkedList1.push("4");
        linkedList1.push("5");
        linkedList1.push("6");
        System.out.println(linkedList1);
        System.out.println(linkedList1.poll());
        System.out.println(linkedList1);
        System.out.println(linkedList1.poll());
        System.out.println(linkedList1);

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.push("1");
        linkedList2.push("2");
        linkedList2.push("3");
        linkedList2.push("4");
        linkedList2.push("5");
        linkedList2.push("6");
        System.out.println(linkedList2);
        System.out.println(linkedList2.peek());
        System.out.println(linkedList2);
        System.out.println(linkedList2.peek());
        System.out.println(linkedList2);
    }

    private JavaCollectionTest( ArrayList<String> list, HashSet<String> set, Vector<String> vector, LinkedList<String> ll){
        this.clsList = list;
        this.clsSet = set;
        this.clsVector = vector;
        this.clsLl = ll;
    }

    @Override
    public void run() {
        for(int j=0;j<1000;j++){
            clsList.add(Thread.currentThread().getName() + j);
            clsSet.add(Thread.currentThread().getName() + j);
            clsVector.add(Thread.currentThread().getName() + j);
            clsLl.add(Thread.currentThread().getName() + j);
        }
    }
}
