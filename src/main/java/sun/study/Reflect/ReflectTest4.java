package sun.study.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest4 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class clz = Class.forName("sun.study.Reflect.ReflectEntity");

        Constructor c = clz.getConstructor(new Class[]{String.class});
        Object object = c.newInstance("royi");

        Method m3 = clz.getMethod("pbFun3", String.class);
        m3.invoke(object, "sun");

        Method m4 = clz.getMethod("pbFun4");
        m4.invoke(object);

    }
}
