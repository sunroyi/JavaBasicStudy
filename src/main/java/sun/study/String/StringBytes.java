package sun.study.String;

import java.util.stream.Stream;

public class StringBytes {

    public static void main(String[] args){

        String strTest = "我的名字是Royi";

        byte[] byteTest = strTest.getBytes();

        for(byte b:byteTest)
            System.out.println(b);

        System.out.println("--------------------------");

        String strChange = new String(byteTest);

        System.out.println(strChange);
    }
}
