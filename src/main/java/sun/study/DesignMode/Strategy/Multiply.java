package sun.study.DesignMode.Strategy;

public class Multiply implements ICalculater {
    @Override
    public int calculater(int a, int b) {
        return a * b;
    }
}
