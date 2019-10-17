package sun.study.DesignMode2.Composite;

public abstract class Company {

    private String name;

    public Company(){}

    public Company(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int deep);
}
