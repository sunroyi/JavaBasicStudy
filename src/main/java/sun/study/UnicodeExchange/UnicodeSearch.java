package sun.study.UnicodeExchange;

import sun.study.DataType.HashTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class UnicodeSearch {

    public static void main(String[] args) throws IOException {

        System.out.println("Process Begin...");

        File folder = new File("C:\\task\\download");

        File[] fs = folder.listFiles();

        Set<String> codeSet = new HashSet<>();

        for(File file:fs){
            if (file.getName().contains(".txt")){
                System.out.println(file.getName() + " is reading...");

                FileInputStream fis = new FileInputStream(file.getAbsolutePath());
                Long fileLength = file.length();

                byte[] bs = new byte[fileLength.intValue()];
                int len = 0;

                while((len = fis.read(bs)) != -1){

                    String line = new String(bs, 0, len);

                    for(char c:line.toCharArray()){

                        codeSet.add(UnicodeUtils.encodeUnicode(c));
                    }
                }

                fis.close();

                System.out.println(file.getName() + " finish.");
            }
        }

        // 出力
        System.out.println("Result.csv Output begin...");

        File fo = new File("W:\\Task\\Download\\Result.csv");
        if (fo.exists())
            fo.delete();

        FileOutputStream fos = new FileOutputStream("W:\\Task\\Download\\Result.csv");

        List<String> ls = new ArrayList<>();
        Collections.sort(ls);

        Iterator<String> it = ls.iterator();
        String before = "";

        while(it.hasNext()){
            String next = it.next();

            if (before.equals("")){
                before = next.substring(0, 1);
            }else if (!before.equals(next.substring(0, 1))){
                before = next.substring(0, 1);
                fos.write("\r\n".getBytes());
            }

            fos.write((next+":"+UnicodeUtils.decodeUnicode(next)+",").getBytes());
        }

        fos.close();

        System.out.println("Result.csv finish.");
    }
}
