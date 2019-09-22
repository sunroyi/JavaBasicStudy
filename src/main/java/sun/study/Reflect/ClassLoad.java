package sun.study.Reflect;

public class ClassLoad {

    public static String str1 = "1";
    public String str2="2";
    public String str3="3";

    static{
        System.out.println("str1=" + str1);
    }

    public ClassLoad(){
        System.out.println("str2=" + str2);
        System.out.println("ClassLoad()");
    }

    public void fun1(){
        System.out.println("str3=" + str3);
    }
}
