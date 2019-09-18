package sun.study.Reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest3 {

    public static void main(String[] args){

        try {
            Class clz = Class.forName("sun.study.Reflect.ReflectEntity");

            Constructor c = clz.getConstructor(new Class[]{String.class});

            Object o = c.newInstance("str3");

            Annotation[] as = clz.getAnnotations();

            int i=1;
            System.out.println(as.length);
            for(Annotation a:as){
                System.out.println(i+ a.toString());
                i++;
            }

            System.exit(0);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
