package sun.study.UnicodeExchange;

import java.nio.charset.Charset;

public class UnicodeUtils {

    public static void showSystemCharset(){

        System.out.println("System File Encoding:" + System.getProperty("file.encoding"));
        System.out.println("Charset:" + Charset.defaultCharset());
    }

    public static String encodeUnicode(char charData){
        return plusZero(Integer.toHexString(charData));
    }

    public static String decodeUnicode(String strData){
        return new Character((char)Integer.parseInt(strData, 16)).toString();
    }

    private static String plusZero(String strInput){

        if (strInput.length()<4){
            strInput = "0" + strInput;
            strInput = plusZero(strInput);
        }

        return strInput;
    }
}
