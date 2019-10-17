package sun.study.DesignMode2.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<IObserver> observerList;
    final String name = "Subject";

    public Subject(){
        observerList = new ArrayList<>();
    }

    public void addObserver(IObserver observer){
        observerList.add(observer);
    }

    public void update(){
        System.out.println("Subject Updated");
        notifyObservers();
    }

    public void notifyObservers(){
        for(IObserver observer:observerList){
            observer.receive(name);
        }
    }
}
