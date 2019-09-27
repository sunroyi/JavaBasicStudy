package sun.study.DesignMode.Composite;

import java.util.ArrayList;
import java.util.List;

public class SubDepartment extends Company {

    public SubDepartment(String name){
        super(name);
    }

    @Override
    protected void add(Company c) {
    }

    @Override
    protected void remove(Company c) {
    }


    @Override
    protected void display() {
        System.out.println(this.getName());
    }
}
