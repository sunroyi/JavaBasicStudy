package sun.study.DesignMode.Observer;

public interface Subject{
    public void add(Observer observer);

    public void delete(Observer observer);

    public void notifyObservers();

    public void operation();
}
