package sun.study.DesignMode.Builder;

public class BuilderTest {

    public static void main(String[] args){
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ConcreateBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
