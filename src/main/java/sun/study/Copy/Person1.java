package sun.study.Copy;

public class Person1 {

    public String name;
    public int age;

    public Person1(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
