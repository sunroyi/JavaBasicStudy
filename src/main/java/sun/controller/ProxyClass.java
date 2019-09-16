package sun.controller;

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
        for(Object obj:args){
            System.out.println(obj);
        }

        Object ret = null;

        try {
            System.out.println("Method Start");

            method.invoke(proxy, args);

            System.out.println("Method End");
        }catch(Exception ex){
            System.out.println("Proxy Error");
        }

        System.out.print("Proxy End");

        return ret;
    }
}
