package sun.study.String;

public class Reverse {

    public static void main(String[] args){
        String strIn = "adsga4093kgag";

        System.out.println(reverse(strIn));
    }

    public static String reverse(String strIn){

        String ret = "";

        String[] aryIn = strIn.split("");

        for(int i=aryIn.length-1;i>-1;i--){
            ret += aryIn[i];
        }

        return ret;
    }
}
