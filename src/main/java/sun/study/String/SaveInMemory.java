package sun.study.String;

import common.entity.RestfulResult;

public class SaveInMemory {

    public static void main(String[] args){

        String a = "123";
        String b = "123";

        System.out.println(a==b);

        RestfulResult r1 = new RestfulResult();
        RestfulResult r2 = r1;

        System.out.println(r1==r2);

    }
}
