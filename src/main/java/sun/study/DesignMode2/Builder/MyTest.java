package sun.study.DesignMode2.Builder;

public class MyTest {

    public static void main(String[] args){

        Person person = (new Builder()).buildPerson();
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());

    }
}
