package sun.study.DesignMode.Observer;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

    private Vector<Observer> oList = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        oList.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        oList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = oList.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }
}
