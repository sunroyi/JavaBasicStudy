package sun.study.DesignMode2.Builder;

public interface BuilderInterface {

    public void buildHead();
    public void buildBody();
    public void buildFoot();

    Person buildPerson();
}
