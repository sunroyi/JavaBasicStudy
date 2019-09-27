package sun.study.DesignMode.Mediator;

public class ColleagueA extends AbstractColleague {
    public ColleagueA(AbstractMediator mediator) {
        super(mediator);
    }

    public void self(){
        System.out.println("ColleagueA self");
    }

    public void out(){
        System.out.println("ColleagueA let ColleagueB do self");

        super.mediator.execute("ColleagueB", "self");
    }
}
