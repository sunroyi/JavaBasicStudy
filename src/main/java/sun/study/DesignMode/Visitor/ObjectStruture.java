package sun.study.DesignMode.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectStruture {

    public static List<Element> getList(){
        List<Element> list = new ArrayList<>();

        Random r = new Random();

        for(int i=0;i<10;i++){

            int a = r.nextInt(100);

            if (a>50)
                list.add(new ConcreateElement1());
            else
                list.add(new ConcreateElement2());
        }

        return list;
    }
}
