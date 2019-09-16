package sun.controller;

public class ProxyClassTest {
    public static void main(String[] args){

        ProxyClass pc = new ProxyClass();

        // 为什么动态代理只能代理有接口的类？
        // 因为动态代理生成的代理类是这样的：
        // public final class $Proxy0 extends Proxy implements YourInterface {}
        // 代理类默认继承了Proxy类，Java无法继承多个类，但是可以实现多个接口，所以只能根据接口来代理
        ProxyInterface re = (ProxyInterface)pc.newProxyInstance(new ProxyImpl());

        re.showTwoString("1", "2");
        re.showName("Royi");
        re.showNoArg();
    }
}
