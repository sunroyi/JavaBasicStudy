package sun.study.Reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest3 {

    public static void main(String[] args){

        try {
            Class clz = Class.forName("sun.study.Reflect.ReflectEntity");

            Constructor c = clz.getConstructor(new Class[]{String.class});
            Object o = c.newInstance("str3");

            Method[] ms = clz.getMethods();
            for(Method m:ms){
                SunMapping[] sms = m.getAnnotationsByType(SunMapping.class);
                if(sms.length>0){
                    for(SunMapping sm : sms){
                        if (sm.value().equals("myReflect1")){
                            m.invoke(o);
                        }
                    }
                }
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
