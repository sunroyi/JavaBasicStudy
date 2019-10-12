package sun.study.DesignMode2.Strategy;

public class Minus implements ICalculater {
    @Override
    public int calculater(int a, int b) {
        return a-b;
    }
}
