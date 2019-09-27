package sun.study.DesignMode.Mediator;

import java.util.Hashtable;

public abstract class AbstractMediator {

    protected Hashtable<String, AbstractColleague> colleagues = new Hashtable<>();

    public void addColleage(String name, AbstractColleague c){
        colleagues.put(name, c);
    }

    public void deleteColleague(String name){
        colleagues.remove(name);
    }

    public abstract void execute(String name, String method);
}
