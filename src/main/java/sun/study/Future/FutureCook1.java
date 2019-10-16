package sun.study.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureCook1 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Callable<Chuju> onlineShoppingTask = new Callable<Chuju>() {
            @Override
            public Chuju call() throws Exception {
                System.out.println("第一步：网上购物");
                System.out.println("第一步：等待送货");
                Thread.sleep(5000);
                System.out.println("第一步：快递送到");
                return new Chuju();
            }
        };

        FutureTask<Chuju> task = new FutureTask<>(onlineShoppingTask);
        new Thread(task).start();

        Thread.sleep(3000);
        Cailiao cailiao = new Cailiao();
        System.out.println("第二步：材料购买");

        if (!task.isDone()){
            System.out.println("等待厨具送到");
        }

        Cook(task.get(), cailiao);
        System.out.println("第三步：开始料理");

    }

    static class Chuju{};

    static class Cailiao{};

    static void Cook(Chuju chuju, Cailiao cailiao){};
}
