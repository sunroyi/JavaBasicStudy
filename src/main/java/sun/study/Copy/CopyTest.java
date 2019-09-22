package sun.study.Copy;

public class CopyTest {

    public static void main(String[] args){
        Person p = new Person();
        p.setName("1");
        p.setAge(1);
        System.out.println("原始Person:");
        System.out.println(p.getName() + ":" + p.getAge());

        System.out.println("深Copy:");
        Person2 p2 = new Person2(p);
        p2.setName("3");
        p2.setAge(3);
        System.out.println(p.getName() + ":" + p.getAge());

        System.out.println("浅Copy:");
        Person p1 = p;
        p1.name = "2";
        p1.age = 2;
        System.out.println(p.getName() + ":" + p.getAge());
    }
}
