package sun.study.Stream;

import java.io.*;

public class SearchText1 {

    public static void main(String[] args){

        File file = new File("D:\\workspace\\JavaBasicStudy\\resource\\SearchText.txt");

        try {
            InputStream is = new FileInputStream(file);

            byte[] bs = new byte[512];

            int a = 0;
            int count = 0;

            while((a=is.read(bs)) != -1){

                String[] aryString = new String(bs, 0, a).split("");

                for(String s:aryString){
                    if (s.equals("a"))
                        count++;
                }
            }

            System.out.println("Count:" + count);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
