package sun.study.FullHalfExchange;

import java.util.Arrays;

public class JapaneseEnglishExchange {

    static String strFullKanaPart1 = "アイウエオカキクケコサシスセソタチツテトナニヌネノハヒフヘホマミムメモヤユヨラリルレロワヲンーャュョァィゥェォッ゛゜";
    static String strFullKanaPart2 = "ヴ,ガ,ギ,グ,ゲ,ゴ,ザ,ジ,ズ,ゼ,ゾ,ダ,ヂ,ヅ,デ,ド,バ,ビ,ブ,ベ,ボ,パ,ピ,プ,ペ,ポ";
    static String strFullEnglish = "ＡＢＣＤＥＦＧＨＩＪＫＬＭＮＯＰＱＲＳＴＵＶＷＸＹＺ";

    static String strHalfKanaPart1 = "ｱｲｳｴｵｶｷｸｹｺｻｼｽｾｿﾀﾁﾂﾃﾄﾅﾆﾇﾈﾉﾊﾋﾌﾍﾎﾏﾐﾑﾒﾓﾔﾕﾖﾗﾘﾙﾚﾛﾜｦﾝｰｬｭｮｧｨｩｪｫｯﾞﾟ";
    static String strHalfKanaPart2 = "ｳﾞ,ｶﾞ,ｷﾞ,ｸﾞ,ｹﾞ,ｺﾞ,ｻﾞ,ｼﾞ,ｽﾞ,ｾﾞ,ｿﾞ,ﾀﾞ,ﾁﾞ,ﾂﾞ,ﾃﾞ,ﾄﾞ,ﾊﾞ,ﾋﾞ,ﾌﾞ,ﾍﾞ,ﾎﾞ,ﾊﾟ,ﾋﾟ,ﾌﾟ,ﾍﾟ,ﾎﾟ";
    static String strHalfEnglish = "abcdefghijklmnopqrstuvwxyz";
    
    public static String exchangeToHalf(String str)
    {
        StringBuilder sb = new StringBuilder();

        try {
            for (String strInput : str.split("")) {
                if (strFullKanaPart1.contains(strInput)) {
                    int index = strFullKanaPart1.indexOf(strInput);
                    sb.append(strHalfKanaPart1.substring(index,index+1));
                } else if (strFullKanaPart2.contains(strInput)) {
                    String[] arrFullKaka = strFullKanaPart2.split(",");
                    String[] arrHalfKana = strHalfKanaPart2.split(",");
                    int index = Arrays.asList(arrFullKaka).indexOf(strInput);
                    sb.append(arrHalfKana[index]);
                } else if (strFullEnglish.contains(strInput)) {
                    int index = strFullEnglish.indexOf(strInput);
                    sb.append(strHalfEnglish.substring(index,index+1));
                } else {
                    sb.append(strInput);
                }
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        return sb.toString();
    }

    public static String exchangeToFull(String str)
    {
        StringBuilder sb = new StringBuilder();

        try {
            for (String strInput : str.split("")) {
                if (strHalfKanaPart1.contains(strInput)) {
                    int index = strHalfKanaPart1.indexOf(strInput);
                    sb.append(strFullKanaPart1.substring(index,index+1));
                } else if (strHalfKanaPart2.contains(strInput)) {
                    String[] arrFullKana = strFullKanaPart2.split(",");
                    String[] arrHalfKana = strHalfKanaPart2.split(",");
                    int index = Arrays.asList(arrHalfKana).indexOf(strInput);
                    sb.append(arrFullKana[index]);
                } else if (strHalfEnglish.contains(strInput)) {
                    int index = strHalfEnglish.indexOf(strInput);
                    sb.append(strFullEnglish.substring(index,index+1));
                } else {
                    sb.append(strInput);
                }
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        return sb.toString();
    }
}
