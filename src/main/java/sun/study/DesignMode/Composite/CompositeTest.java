package sun.study.DesignMode.Composite;

public class CompositeTest {

    public static void main(String[] args){
        Company first = new ConcreateCompany();
        first.setName("总公司");

        Company second1 = new ConcreateCompany("分公司1");
        second1.add(new SubDepartment("财务部1"));
        second1.add(new SubDepartment("人力资源部1"));

        Company second2 = new ConcreateCompany("分公司2");
        second2.add(new SubDepartment("财务部2"));
        second2.add(new SubDepartment("人力资源部2"));

        first.add(second1);
        first.add(second2);
        first.display();
    }
}
