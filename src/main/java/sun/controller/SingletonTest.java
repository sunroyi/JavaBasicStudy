package sun.controller;

public class SingletonTest implements Runnable {

    public static void main(String[] args){
        for(int i=0;i<10;i++){
            Thread thread = new Thread(new SingletonTest());
            thread.start();
        }

        try{
            Thread.sleep(500);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("result:" + SingletonClass.getInstance().getCount());
        System.exit(0);
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++) {
            SingletonClass.getInstance().plusCount();
            //System.out.println(SingletonClass.getInstance().getCount());
        }
    }
}
