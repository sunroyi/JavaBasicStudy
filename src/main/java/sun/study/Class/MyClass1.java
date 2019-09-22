package sun.study.Class;

public class MyClass1 {

    private String strPrivate = "1";
    String strDefault = "2";
    protected String strProtected = "3";
    public String strPublic = "4";

    public void showString(){
        System.out.println(strPrivate);
        System.out.println(strDefault);
        System.out.println(strProtected);
        System.out.println(strPublic);
    }
}
