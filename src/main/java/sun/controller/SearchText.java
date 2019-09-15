package sun.controller;

import java.io.*;

public class SearchText {

    public static void main(String[] args){
        File file = new File("D:\\workspace\\JavaBasicStudy\\resource\\SearchText.txt");

        try {
            InputStream is = new FileInputStream(file);

            byte b[] = new byte[1024];

            int a;
            int count=0;

            while((a=is.read(b))!=-1){
                String[] aryStr = new String(b, 0, a).split("");

                for(int i=0;i<aryStr.length;i++){
                    if ("a".equals(aryStr[i]))
                        count++;
                }
            }

            System.out.println(count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
