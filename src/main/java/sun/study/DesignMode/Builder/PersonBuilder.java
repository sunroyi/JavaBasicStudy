package sun.study.DesignMode.Builder;

public interface PersonBuilder {

    public void buildHead();
    public void buildBody();
    public void buildFoot();
    Person buildPerson();
}
