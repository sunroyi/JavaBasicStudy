package sun.study.DesignMode2.Command;

import java.util.ArrayList;
import java.util.List;

public class Invoke {

    List<Soilder> soilderList;

    public Invoke(){
        soilderList = new ArrayList<>();
    }

    public void add(Soilder soilder){
        soilderList.add(soilder);
    }

    public void exec(String command){

        for(Soilder soilder:soilderList) {
            soilder.exec(command);
        }
    }
}
