package sun.study.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest1 {
    public static void main(String[] args){

        try {
            Class clz = Class.forName("sun.study.Reflect.ReflectEntity");
            Constructor c = clz.getDeclaredConstructor(new Class[]{String.class});
            c.setAccessible(true);
            Object object = c.newInstance("str3");

            System.out.println("Print All Method:");
            Method[] methods = clz.getDeclaredMethods();
            for(Method method:methods) {
                System.out.println(method.getName());
            }

            Method method1 =  clz.getMethod("pbFun1");
            //Method method2 =  clz.getMethod("pbFun2");
            Method method3 =  clz.getMethod("pbFun3", String.class);
            method1.invoke(object);
            //method2.invoke(object);   // Private无法调用
            method3.invoke(object, "!");

            System.out.println("Print Public Field:");
            Field[] fields = clz.getFields();
            for(Field f:fields){
                System.out.println(f.getName() + " --- " + f.getType() + " --- " + f.get(object));
            }

            System.out.println("Print All Field:");
            Field[] dFields = clz.getDeclaredFields();
            for(Field f:dFields){
                // Private字段无法获取他的值
                //System.out.println(f.getName() + " --- " + f.getType() + " --- " + f.get(object));
                System.out.println(f.getName() + " --- " + f.getType());
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
