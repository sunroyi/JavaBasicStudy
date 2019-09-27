package sun.study.DesignMode.Composite;

public abstract class Company {

    private String name;

    public Company(){};

    public Company(String name){
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void add(Company c);

    protected abstract void remove(Company c);

    protected abstract void display();
}
