package sun.study.Reflect;

public class ReflectEntity {

    public String pbStr1="String1";
    private String pbStr2="String2";
    public String pbStr3;

    public ReflectEntity(String str){
        pbStr3 = str;
    }

/*    public ReflectEntity(){
        //pbStr3 = str;
    }*/

    public void pbFun1(){
        System.out.println("ReflectEntiy pbFunc1 Execute.");
    }

    private void pbFun2(){
        System.out.println("ReflectEntiy pbFunc1 Execute.");
    }

    public void pbFun3(String str){
        System.out.println("ReflectEntiy pbFunc2 Execute " + str);
    }
}
