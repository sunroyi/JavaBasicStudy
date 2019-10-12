package sun.study.DesignMode2.Template;

public abstract class AbstractCalculater {

    public final int Calculate(String exp, String opt){
        int[] aryNum = splite(exp, opt);
        return Calculate(aryNum[0], aryNum[1]);
    }

    public abstract int Calculate(int a, int b);

    public int[] splite(String exp, String opt){

        int[] aryNum = new int[2];

        String[] aryExp = exp.split(opt);

        aryNum[0] = Integer.parseInt(aryExp[0]);
        aryNum[1] = Integer.parseInt(aryExp[1]);

        return aryNum;
    }
}
