package sun.study.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyClass implements InvocationHandler {

    private Object targetObject;

    public Object newProxyInstance(Object targetObject){
        this.targetObject = targetObject;

        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Proxy Start " + method.getName());

        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }

        Object ret = null;

        try {
            System.out.println("Method Start");

            method.invoke(targetObject, args);

            System.out.println("Method End");
        }catch(Exception ex){
            System.out.println("Proxy Error");
        }

        System.out.println("Proxy End");
        System.out.println("-----------------");

        return ret;
    }
}
