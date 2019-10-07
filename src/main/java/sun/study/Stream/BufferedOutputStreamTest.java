package sun.study.Stream;

import java.io.*;

public class BufferedOutputStreamTest {

    public static void main(String[] args){

        try {
            FileOutputStream fos = new FileOutputStream("D:\\workspace\\JavaBasicStudy\\resource\\BufferedOutputStreamTest.txt");

            BufferedOutputStream bos = new BufferedOutputStream(fos);

            bos.write("Hello World".getBytes());

            bos.flush();
            bos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
