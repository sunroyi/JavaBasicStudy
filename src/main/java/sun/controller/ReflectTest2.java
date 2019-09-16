package sun.controller;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest2 {

    public static void main(String[] args){

        try {
            Class clz = Class.forName("sun.controller.ReflectEntity");

            Constructor c = clz.getDeclaredConstructor(new Class[]{String.class});
            c.setAccessible(true);
            Object obj = c.newInstance("str3");

            System.out.println("Print All Methods:");
            Method[] methods = clz.getDeclaredMethods();
            for(Method m:methods){
                System.out.println(m.getName());
                Class[] cs = m.getParameterTypes();
                for(Class cls:cs){
                    System.out.println(cls.getName());
                }
            }

            System.out.println("Print All Fields:");
            Field[] fields = clz.getDeclaredFields();
            for(Field f:fields){
                System.out.println(f.getName());
            }

            System.out.println("Invoke Pulic Method:");
            Method[] ms = clz.getDeclaredMethods();
            for(Method m:ms){
                if (m.toString().startsWith("private"))
                    continue;

                if (m.getParameterTypes().length > 0)
                    m.invoke(obj,"Test");
                else
                    m.invoke(obj);
            }

            System.out.println("Get Public Field:");
            Field[] fs = clz.getFields();
            for(Field f:fs){
                System.out.println(f.getName() + ":" + f.get(obj));
            }

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
