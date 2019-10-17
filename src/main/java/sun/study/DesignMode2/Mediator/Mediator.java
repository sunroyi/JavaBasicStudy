package sun.study.DesignMode2.Mediator;

import java.util.Hashtable;

public class Mediator {

    Hashtable<String, Colleague> colleagueTable;

    public Mediator(){
        colleagueTable = new Hashtable<>();
    }

    public void add(String key, Colleague value){
        colleagueTable.put(key, value);
    }

    public void doSelf(String key){
        colleagueTable.get(key).doSelf();
    }

    public void doOut(String key){
        colleagueTable.get(key).doOut();
    }

}
