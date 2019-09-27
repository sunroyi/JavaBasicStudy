package sun.study.DesignMode.Mediator;

public class ColleagueB extends AbstractColleague {
    public ColleagueB(AbstractMediator mediator) {
        super(mediator);
    }

    public void self(){
        System.out.println("ColleagueB self");
    }

    public void out(){
        System.out.println("ColleagueB let ColleagueA do self");

        super.mediator.execute("ColleagueA", "self");
    }
}
