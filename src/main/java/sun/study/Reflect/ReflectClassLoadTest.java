package sun.study.Reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectClassLoadTest {

    public static void main(String[] args){
        try {
            System.out.println("Start Class.forName");
            Class<?> clz1 = Class.forName("sun.study.Reflect.ClassLoad");
            System.out.println("Start Constructor");
            Constructor c1 = clz1.getDeclaredConstructor();
            System.out.println("Start newInstance");
            Object o1 = clz1.newInstance();
            System.out.println("Start fun1");
            Method m1 = clz1.getMethod("fun1");
            m1.invoke(o1);
            System.out.println("End Class.forName");

            System.out.println("------------------------------");

            //System.out.println("ClassLoader只能指定class，不能通过java文件读取");
            System.out.println("Start ClassLoader");
            ClassLoader cls2 = ClassLoader.getSystemClassLoader();
            String myClass = "sun.study.Reflect.ClassLoad".replace(".", "\\");
            //Class<?> clz2 = cls2.loadClass("D:\\workspace\\JavaBasicStudy\\resource\\" + myClass + ".class");
            Class<?> clz2 = cls2.loadClass("sun.study.Reflect.ClassLoad");
            System.out.println("Start newInstance");
            Object o2 = clz2.newInstance();
            System.out.println("Start fun1");
            Method m2 = clz2.getMethod("fun1");
            m2.invoke(o2);
            System.out.println("End ClassLoader");

            System.exit(0);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
