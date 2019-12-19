package sun.study.Thread;

public class ThreadRunnableTest {

    static class Thread1 extends Thread {

        private int count=5;
        private String name;

        public Thread1(String name){
            this.name = name;
        }

        public void run(){

            for(int i=0;i<5;i++){
                System.out.println(name + " is running. count = " + count--);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public static void main(String[] args){

        Thread1 t1 = new Thread1("A");
        Thread1 t2 = new Thread1("B");

        t1.start();
        t2.start();

        Thread2 t3 = new Thread2();
        new Thread(t3, "C").start();
        new Thread(t3, "D").start();
        new Thread(t3, "E").start();
    }

    static class Thread2 implements Runnable{

        private int count = 15;

        @Override
        public void run() {
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName() + " is running. count = " + count--);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
