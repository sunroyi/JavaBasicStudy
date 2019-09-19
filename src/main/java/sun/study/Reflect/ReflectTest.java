package sun.study.Reflect;

public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException {

        // Class.forName
        Class clz1 = Class.forName("sun.study.Reflect.ReflectEntity");
        System.out.println(clz1.getName());

        // .class
        Class clz2 = ReflectEntity.class;
        System.out.println("clz1==clz2:" + (clz1==clz2));

        // getClass
        ReflectEntity re = new ReflectEntity("");
        Class clz3 = re.getClass();
        System.out.println("clz1==clz3:" + (clz1==clz3));
    }

}
