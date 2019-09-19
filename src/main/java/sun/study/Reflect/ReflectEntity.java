package sun.study.Reflect;

import org.springframework.web.bind.annotation.RequestMapping;

@SunMapping("myReflectEntity")
@RequestMapping("test")
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

    @SunMapping("myReflect1")
    @RequestMapping("test1")
    public void pbFun1(){
        System.out.println("ReflectEntiy pbFunc1 Execute.");
    }

    private void pbFun2(){
        System.out.println("ReflectEntiy pbFunc1 Execute.");
    }

    @SunMapping("myReflect3")
    public void pbFun3(String str){
        System.out.println("ReflectEntiy pbFunc2 Execute " + str);
    }
}
