package sun.study.Stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamTest {

    public static void main(String[] args){

        try {
            FileInputStream fis = new FileInputStream("D:\\workspace\\JavaBasicStudy\\resource\\SearchText.txt");

            BufferedInputStream bis = new BufferedInputStream(fis);

            byte[] bs = new byte[1024];
            int len;

            while((len=bis.read(bs)) != -1)
                System.out.println(new String(bs, 0, len));

            bis.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
