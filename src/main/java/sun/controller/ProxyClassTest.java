package sun.controller;

public class ProxyClassTest {
    public static void main(String[] args){

        ProxyClass pc = new ProxyClass();
        ReflectEntity re = (ReflectEntity)pc.newProxyInstance(new ReflectEntity("Test"));

        re.pbFun1();
        re.pbFun3("Proxy");
    }
}
