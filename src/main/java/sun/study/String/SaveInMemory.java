package sun.study.String;

import common.entity.RestfulResult;

public class SaveInMemory {

    int a = 1;
    String b = "123";
    String c = new String("456");
    static String d = new String("789");

    public static void main(String[] args){

        int x = 1;
        int y = 1;

        System.out.println(x==y);

        String a = "123";
        String b = "123";

        System.out.println(a==b);

        String c = new String("123");
        String d = new String("123");

        System.out.println(c==d);
        System.out.println(c.equals(d));

        RestfulResult r1 = new RestfulResult();
        RestfulResult r2 = new RestfulResult();

        System.out.println(r1==r2);

    }
}
