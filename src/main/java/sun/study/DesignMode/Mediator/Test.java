package sun.study.DesignMode.Mediator;

public class Test {

    public static void main(String[] args){

        AbstractMediator m = new Mediator();

        ColleagueA a = new ColleagueA(m);
        ColleagueB b = new ColleagueB(m);

        m.addColleage("ColleagueA", a);
        m.addColleage("ColleagueB", b);

        a.self();
        a.out();

        System.out.println("-----------------------");

        b.self();
        b.out();
    }
}
