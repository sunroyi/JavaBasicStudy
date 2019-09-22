package sun.study.ClassDifferent;

import sun.study.Class.MyClass1;

public class MyClass3 extends MyClass1 {

    public void showMessage(){
        System.out.println(this.strProtected);
        System.out.println(this.strPublic);
    }
}
