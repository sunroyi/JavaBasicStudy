package sun.study.DesignMode2.Builder;

public class Builder implements BuilderInterface {

    private Person person;

    public Builder(){
        this.person = new Person();
        buildHead();
        buildBody();
        buildFoot();
    }

    @Override
    public void buildHead() {
        person.setHead("创建头部");
    }

    @Override
    public void buildBody() {
        person.setBody("创建身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("创建脚部");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
