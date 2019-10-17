package sun.study.DesignMode2.Composite;

public class MyTest {

    public static void main(String[] args){

        Company master = new MyCompany("总公司");

        Company slave1 = new MyCompany("分公司1");
        Company slave2 = new MyCompany("分公司2");
        master.add(slave1);
        master.add(slave2);

        Company department1 = new MyDepartment("部门1");
        Company department2 = new MyDepartment("部门2");
        Company department3 = new MyDepartment("部门3");
        Company department4 = new MyDepartment("部门4");
        slave1.add(department1);
        slave1.add(department2);
        slave2.add(department3);
        slave2.add(department4);

        master.display(0);

    }
}
