package sun.study.JavaCollection.List;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args){

        System.out.println("LinkedList Test(FIFO):");
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("C");
        System.out.println(list);
        list.addFirst("X");
        list.addLast("Y");
        System.out.println(list);
        System.out.println(list.poll());
        for(int i=0;i<list.size();)
            System.out.println(list.poll());

        System.out.println("LinkedList Test(LIFO):");
        list.push("A");
        list.push("A");
        list.push("B");
        list.push("B");
        list.push("C");
        list.push("C");
        System.out.println(list);
        list.addFirst("X");
        list.addLast("Y");
        System.out.println(list);
        System.out.println(list.poll());
        for(int i=0;i<list.size();)
            System.out.println(list.poll());

        System.out.println("Get First & Last:");
        LinkedList<String> ll = new LinkedList<>();
        ll.push("Apple");
        ll.push("Banana");
        ll.push("Orange");
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println("Stack:");
        MyStack ms = new MyStack();
        for(int i=0;i<10;i++)
            ms.push(i);

        for(int i=0;i<10;i++)
            System.out.println(ms.poll());


        System.out.println("Queue:");
        MyQueue mq = new MyQueue();
        for(int i=0;i<10;i++)
            mq.push(i);

        for(int i=0;i<10;i++)
            System.out.println(mq.poll());

    }
}

class MyStack{

    private LinkedList list = new LinkedList();

    public void push(Object v){
        list.push(v);
    }

    public Object poll(){
        return list.removeFirst();
    }
}

class MyQueue{

    private LinkedList list = new LinkedList();

    public void push(Object v){
        list.add(v);
    }

    public Object poll(){
        return list.removeFirst();
    }

}

