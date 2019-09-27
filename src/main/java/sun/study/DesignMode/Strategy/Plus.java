package sun.study.DesignMode.Strategy;

public class Plus implements ICalculater {
    @Override
    public int calculater(int a, int b) {
        return a + b;
    }
}
