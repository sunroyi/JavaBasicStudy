package sun.study.DesignMode.Mediator;

public class Mediator extends AbstractMediator {

    @Override
    public void execute(String name, String method) {

        if (method.equals("self")){
            if (name.equals("ColleagueA")){
                ColleagueA a = (ColleagueA) super.colleagues.get(name);
                a.self();
            }else{
                ColleagueB b = (ColleagueB) super.colleagues.get(name);
                b.self();
            }
        }else{
            if (name.equals("ColleagueA")){
                ColleagueA a = (ColleagueA) super.colleagues.get(name);
                a.out();
            }else{
                ColleagueB b = (ColleagueB) super.colleagues.get(name);
                b.out();
            }
        }
    }
}
