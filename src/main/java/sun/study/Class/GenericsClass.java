package sun.study.Class;

public class GenericsClass<T> {

    T a;

    public GenericsClass(T b){
        this.a = b;
    }

    public <Q> void showName1(Q q){
        System.out.println("showName1:" + q);
    }

    public void showName2(T t){
        System.out.println("showName2:" + t);
    }

    public void showName3(){
        System.out.println("showName3:" + a);
    }

    public static <W> void showName4(W w){
        System.out.println("showName4:" + w);
    }
}
