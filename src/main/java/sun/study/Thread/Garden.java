package sun.study.Thread;

import java.util.LinkedList;

public class Garden {

    static LinkedList<String> ll = new LinkedList<>();

    private static class TouristThread implements Runnable{

        LinkedList<String> ll;
        String name;

        TouristThread(LinkedList<String> ll, String name){
            this.ll = ll;
            this.name = name;
        }

        @Override
        public void run() {

            System.out.println(name + " is waiting.");

            synchronized (ll) {
                if (ll.size()>=3){
                    try {
                        ll.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                ll.add(name);
                System.out.println(name + " in garden, " + ll.size() + " still in garden.");

                Thread ot = new Thread(new OutThread(name));
                ot.start();
            }
        }
    }

    private static class OutThread implements Runnable{

        String name;

        OutThread(String name){
            this.name = name;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " out.");
            ll.remove(name);
        }
    }


    private static class GardenThread extends Thread{

        LinkedList<String> ll;

        GardenThread(LinkedList<String> ll){
            this.ll = ll;
        }

        @Override
        public void run() {
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (ll) {
                    if (ll.size() < 3) {
                        ll.notify();
                    }
                }
            }
        }
    }
    public static void main(String[] args){

        for(int i=0;i<5;i++){
            Thread tt = new Thread(new TouristThread(ll, "T" + i));
            tt.start();
        }

        GardenThread dt = new GardenThread(ll);
        dt.setDaemon(true);
        dt.start();
    }
}
