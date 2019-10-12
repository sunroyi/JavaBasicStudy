package sun.study.DesignMode2.Composite;

import java.util.ArrayList;
import java.util.List;

public class MyCompany extends Company {

    private List<Company> companyList;

    public MyCompany() {
        companyList = new ArrayList();
    }

    public MyCompany(String name) {
        super(name);
        companyList = new ArrayList();
    }

    @Override
    public void add(Company company) {
        companyList.add(company);
    }

    @Override
    public void remove(Company company) {
        companyList.remove(company);
    }

    @Override
    public void display(int deep) {

        StringBuilder line = new StringBuilder();

        for(int i=0;i<deep;i++) {
            line.append("-");
        }
        line.append(getName());
        System.out.println(line.toString());

        for(Company company:companyList){
            company.display(deep+1);
        }
    }
}
