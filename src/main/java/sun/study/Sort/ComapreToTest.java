package sun.study.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComapreToTest {

    public static void main(String[] args){

        CompareToEntity f1 = new CompareToEntity("sun", 10);
        CompareToEntity f2 = new CompareToEntity("royi", 10);
        CompareToEntity f3 = new CompareToEntity("athena", 30);
        CompareToEntity f4 = new CompareToEntity("steven", 30);
        CompareToEntity f5 = new CompareToEntity("sun", 15);
        CompareToEntity f6 = new CompareToEntity("sun", 25);

        ArrayList<CompareToEntity> list = new ArrayList<>();
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        list.add(f6);

        System.out.println("Before:");
        for(CompareToEntity f:list)
            System.out.println(f.getAge() + " - " + f.getName());

        System.out.println("-----------------------------------");

        Collections.sort(list);

        System.out.println("After1:");
        for(CompareToEntity f:list)
            System.out.println(f.getAge() + " - " + f.getName());

        System.out.println("-----------------------------------");

        Collections.sort(list, new Comparator<CompareToEntity>() {
                    @Override
                    public int compare(CompareToEntity o1, CompareToEntity o2) {
                        if (o1.getName().compareTo(o2.getName()) > 0)
                            return 1;
                        if (o1.getName().compareTo(o2.getName()) < 0)
                            return -1;
                        return 0;
                    }
                });

                System.out.println("After2:");
        for(CompareToEntity f:list)
            System.out.println(f.getAge() + " - " + f.getName());
    }
}
