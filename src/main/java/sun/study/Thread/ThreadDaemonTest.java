package sun.study.Thread;

public class ThreadDaemonTest {

    public static void main(String[] args){
        Thread threadDaemon = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try{
                        System.out.println("Daemon Thread is alive.");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        System.out.println("finally block");    // 守护进程在退出的时候，不会执行finally的代码
                    }
                }
            }
        });

        threadDaemon.setDaemon(true);   // 设为守护进程
        threadDaemon.start();

        try{
            Thread.sleep(10000);
            System.out.println("Main End");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
