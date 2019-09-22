package sun.study.Class;

public class ClassLoadTest {

    int intOut=2;

    public static void main(String[] args){
       Child child = new Child();
        child.funProcess();
        Child.funProcess();

        // 内部类和外部类
        ClassLoadTest clt = new ClassLoadTest();
        clt.loadInFunction();
    }

    // 调用内部类的方法
    private void loadInFunction(){
        InClass ic = new InClass();
        ic.inFunction();
    }

    // 内部类定义
    class InClass{
        int inInt = 1;

        public void inFunction(){
            System.out.println(intOut);
        }
    }
}

class Parent{
    private static int a=1;
    private static int b;
    private int c=intC();
    private int a1=1;

    static{
        b=2;
        System.out.println("1.Parent中的静态代码块执行");
        System.out.println("  Parent中，静态变量初始化，a的值为" + a);
    }
    int intC(){
        System.out.println("3.Parent中的成员变量赋值");
        System.out.println("  Parent中C的值为" + c);
        c=3;
        System.out.println("  Parent中C的值为" + c);
        System.out.println("  Parent中，a1的值为" + a1); // 注意这个，a1此时为0，因为赋值顺序在c的初始化之后
        return c;
    }

    public Parent(){
        System.out.println("4.Parent的构造函数开始执行");
        System.out.println("  a=" + a);
        System.out.println("  b=" + b);
        System.out.println("  c=" + c);
        System.out.println("  Parent中，a1的值为" + a1);
    }

    public static void funProcess(){
        System.out.println("Parent的方法执行");
    }
}

class Child extends Parent{
    private static int d = 4;
    private static int e;
    private int f = initF();

    static{
        e=5;
        System.out.println("2.Child中的静态代码块执行");
        System.out.println("  Child中，静态变量初始化，d的值为" + d);
    }

    int initF(){
        System.out.println("5.Child中的成员变量赋值");
        System.out.println("  Child中f的值为" + f);
        f=3;
        System.out.println("  Child中f的值为" + f);
        return f;
    }

    public Child(){
        System.out.println("6.Child的构造函数开始执行");
        System.out.println("  d=" + d);
        System.out.println("  e=" + e);
        System.out.println("  f=" + f);
    }

    public static void funProcess(){
        System.out.println("7.Child的方法执行");
    }
}