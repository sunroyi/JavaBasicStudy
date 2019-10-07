package sun.study.JavaCollection.Set;

import java.util.TreeSet;

public class MyTreeSet {

    public static void main(String[] args){
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Sun");
        ts.add("Royi");
        ts.add("Athena");
        ts.add("Steven");

        System.out.println("默认的正排序：");
        System.out.println(ts.toString());

        TreeSet<String> tsReverse = new TreeSet<>();
        tsReverse = (TreeSet<String>) ts.descendingSet();
        System.out.println("倒排序：");
        System.out.println(tsReverse);

    }
}
