package sun.study.FullHalfExchange;

import java.io.UnsupportedEncodingException;

public class ASCIIExchange {

    public static String exchangeToHalf(){

        StringBuilder sb = new StringBuilder();

        sb.append("");

        return sb.toString();
    }

    public static String exchangeToFull(String str){

        StringBuilder sb = new StringBuilder();

        sb.append("");

        return sb.toString();
    }

    public static String showAscii(String str) throws UnsupportedEncodingException {

        StringBuilder sb = new StringBuilder();

        for(String strSingle:str.split("")) {

            char[] chars = strSingle.toCharArray();
            for (char aChar : chars) {
                System.err.println("char字符:"+aChar);
                String x = Integer.toHexString(aChar);
                if (x.length() <= 2) {
                    x = "\\u00" + x;
                } else {
                    x = "\\u" + x;
                }
                System.err.println("unicode码:" + x);
                //System.err.println("unicode+1码:" + x);
                //sb.append(x);
            }

            //sb.append("\r\n");
        }

        System.out.println("\\u30a2" + ":" + toUnicode("\\u30a2"));

        return sb.toString();
    }

    public static String toUnicode(String str) {
        str = (str == null ? "" : str);
        if (str.indexOf("\\u") == -1)//如果不是unicode码则原样返回
            return str;
        StringBuffer sb = new StringBuffer(1000);
        for (int i = 0; i < str.length() - 6; ) {
            String strTemp = str.substring(i, i + 6);
            String value = strTemp.substring(2);
            int c = 0;
            for (int j = 0; j < value.length(); j++) {
                char tempChar = value.charAt(j);
                int t = 0;
                switch (tempChar) {
                    case 'a':
                        t = 10;
                        break;
                    case 'b':
                        t = 11;
                        break;
                    case 'c':
                        t = 12;
                        break;
                    case 'd':
                        t = 13;
                        break;
                    case 'e':
                        t = 14;
                        break;
                    case 'f':
                        t = 15;
                        break;
                    default:
                        t = tempChar - 48;
                        break;
                }
                c += t * ((int) Math.pow(16, (value.length() - j - 1)));
            }
            sb.append((char) c);
            i = i + 6;
        }
        return sb.toString();
    }
}
