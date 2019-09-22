package sun.study.Copy;

public class Person2 extends Person{

    public Person2(Person p) {
        this.name = new String(p.getName());
        this.age = new Integer(p.getAge());
    }
}