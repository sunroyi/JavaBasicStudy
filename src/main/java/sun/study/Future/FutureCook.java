package sun.study.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureCook {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();

        // First Step：网购厨具
        Callable<Chuju> onlineShopping = new Callable<Chuju>() {
            @Override
            public Chuju call() throws Exception {
                System.out.println("第一步：下单");
                System.out.println("第一步：等待送货");
                Thread.sleep(5000);
                System.out.println("第一步：快递送到");
                return new Chuju();
            }
        };

        FutureTask<Chuju> task = new FutureTask<Chuju>(onlineShopping);
        new Thread(task).start();

        // Second Step：去超市购买食材
        Thread.sleep(3000);
        Shicai shicai = new Shicai();
        System.out.println("第二步：食材到位");

        // Third Step：用厨具烹饪食材
        if (!task.isDone()){
            System.out.println("第三步：厨具未到，请稍等");
        }
        Chuju chuju = task.get();
        System.out.println("第三步：厨具到位，开始展现厨艺");
        cook(chuju, shicai);

        System.out.println("总用时：" + (System.currentTimeMillis() - startTime) + "ms");
    }

    static void cook(Chuju chuju, Shicai shicai){}

    static class Chuju{};

    static class Shicai{};
}
