package sun.study.DesignMode2.Template;

public class MyTest {

    public static void main(String[] args){

        AbstractCalculater calculater = new Plus();
        System.out.println(calculater.Calculate("8+8", "\\+"));
    }
}
