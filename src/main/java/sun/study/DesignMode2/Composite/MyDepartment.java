package sun.study.DesignMode2.Composite;

public class MyDepartment extends Company {

    public MyDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int deep) {

        StringBuilder line = new StringBuilder();

        for(int i=0;i<deep;i++) {
            line.append("-");
        }
        line.append(getName());
        System.out.println(line.toString());
    }
}
