package sun.study.Thread;

public class ThreadJoinTest {
    public static void main(String[] args){
        Thread previousThread = Thread.currentThread();

        System.out.println(previousThread.getName() + " Created.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i=0; i<10; i++){
            Thread curThread = new JoinThread(previousThread);
            curThread.start();
            System.out.println(curThread.getName() + " Started.");
            previousThread = curThread;
        }
    }

    static class JoinThread extends Thread{
        private Thread thread;

        public JoinThread(Thread thread){
            this.thread = thread;
        }

        @Override
        public void run(){
            try{
                System.out.println(Thread.currentThread().getName() + "will stoped");
                thread.join();
                System.out.println(thread.getName() + " terminated.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
