package sun.study.DesignMode2.Strategy;

public class Plus implements ICalculater {
    @Override
    public int calculater(int a, int b) {
        return a+b;
    }
}
