package sun.study.DesignMode.Builder;

public class ConcreateBuilder implements PersonBuilder {

    Person p;

    public ConcreateBuilder(){
        p = new Person();
    }

    @Override
    public void buildHead() {
        System.out.println("Build Head");
    }

    @Override
    public void buildBody() {
        System.out.println("Build Body");
    }

    @Override
    public void buildFoot() {
        System.out.println("Build Foot");
    }

    @Override
    public Person buildPerson() {
        return p;
    }
}
