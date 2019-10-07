package sun.study.Thread;

public class ThreadLocalTest {

    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
        public Integer initialValue(){
            return 0;
        }
    };

    public int getNextNum(){
        seqNum.set(seqNum.get() + 1);
        return seqNum.get();
    }

    private static class ClientThread extends Thread{

        private ThreadLocalTest sn;

        public ClientThread(ThreadLocalTest sn){
            this.sn = sn;
        }

        public void run(){
            for(int i=0; i<3; i++){
                System.out.println("Thread[" + Thread.currentThread().getName() + "] --> sn[" + sn.getNextNum() + "]");
            }
        }
    }

    public static void main(String[] args){

        ThreadLocalTest sn = new ThreadLocalTest();

        ClientThread ct1 = new ClientThread(sn);
        ClientThread ct2 = new ClientThread(sn);
        ClientThread ct3 = new ClientThread(sn);

        ct1.start();
        ct2.start();
        ct3.start();
    }
}
