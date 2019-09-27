package sun.study.Thread;

public class ThreadStates implements Runnable {

    private String num;

    public ThreadStates(String num){
        this.num = num;
    }

    public static void main(String[] args){
        try {
            Thread thread1 = new Thread(new ThreadStates("1"));
            System.out.println("Thread1 State1 : New");

            Thread thread2 = new Thread(new ThreadStates("2"));
            System.out.println("Thread2 State1 : New");
            thread1.start();
            thread2.start();
            synchronized (thread2) {
                thread2.wait();
                System.out.println("Main Thread State5 : Waiting");
                thread2.notify();
            }
            System.out.println("Main Thread State3 : Running");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread State6 : Dead");

    }

    @Override
    public void run() {
        System.out.println("Thread" + num + " State2 : Runnable");

        try {
            synchronized (this){
                System.out.println("Thread" + num + " State4 : Blocked");
            }

            Thread.sleep(1000);
            System.out.println("Thread" + num + " State5 : Waiting");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread" + num + " State6 : Dead");
    }
}
