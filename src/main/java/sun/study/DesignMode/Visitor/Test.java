package sun.study.DesignMode.Visitor;

import java.util.List;

public class Test {

    public static void main(String[] args){
        List<Element> list = ObjectStruture.getList();

        for(Element e:list){
            e.accept(new Visitor());
        }
    }
}
