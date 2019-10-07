package sun.study.JavaCollection.List;

import java.util.Iterator;
import java.util.LinkedList;

public class UnSafeLinkedList {

    public static void main(String[] args){

        LinkedList<String> ll = new LinkedList<>();

        for (int i=0;i<3;i++){
            WorkThread wt = new WorkThread(ll);
            wt.start();
        }
    }

    static class WorkThread extends Thread{

        private static LinkedList<String> ll = new LinkedList<>();

        public WorkThread(LinkedList<String> ll){
            this.ll = ll;
        }

        public void run(){
            int i=0;
            while(i++<3){
                String val = Thread.currentThread().getName() + ":" + i;
                ll.add(val);
                printAll();
            }
        }

        private static void printAll(){
            Iterator<String> it = ll.iterator();
            while(it.hasNext()){
                System.out.print(it.next() + ",");
            }
            System.out.println();
        }
    }
}
