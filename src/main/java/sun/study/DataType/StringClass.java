package sun.study.DataType;

public class StringClass {

    String qValue;

    public boolean equal(Object obj){
        if (obj == this)
            return true;

        if (obj instanceof String){
            int len1 = qValue.length();
            int len2 = ((String) obj).length();

            if(len1 != len2)
                return false;

            char c1[] = ((String)obj).toCharArray();
            char c2[] = qValue.toCharArray();
            for(int i=0;i<c1.length;i++) {
                if (c1[i] != c2[i])
                    return false;
            }
            return true;
        }

        return false;
    }

    public boolean equalsun(Object strIn){

        if (qValue == strIn)
            return true;

        if (strIn instanceof String){

            char[] cin = ((String) strIn).toCharArray();
            char[] cValue = qValue.toCharArray();

            if (cin.length != cValue.length)
                return false;

            for(int i=0;i<cin.length;i++){
                if (cin[i] != cValue[i])
                    return false;
            }

            return true;
        }

        return false;
    }

    public static void main(String[] args){

        StringClass q1 = new StringClass();
        q1.qValue = "sun";

        System.out.println(q1.equalsun("sun"));
        System.out.println(q1.equals("sun"));
    }
}
