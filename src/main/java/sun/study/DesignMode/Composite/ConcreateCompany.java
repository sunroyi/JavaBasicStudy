package sun.study.DesignMode.Composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreateCompany extends Company {

    private List<Company> companyList;

    public ConcreateCompany(){
        companyList = new ArrayList<>();
    }

    public ConcreateCompany(String name){
        super(name);
        companyList = new ArrayList<>();
    }

    @Override
    protected void add(Company c) {
        companyList.add(c);
    }

    @Override
    protected void remove(Company c) {
        companyList.remove(c);
    }


    @Override
    protected void display() {
        System.out.println(this.getName());
        for (Company c : companyList){
            c.display();
        }

    }
}
