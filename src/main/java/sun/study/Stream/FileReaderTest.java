package sun.study.Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args){

        try {
            FileReader fr = new FileReader("D:\\workspace\\JavaBasicStudy\\resource\\BufferedOutputStreamTest.txt");

            char[] buff = new char[1024];

            int len = 0;

            while((len=fr.read(buff)) != -1) {
                System.out.println(new String(buff, 0 ,len));
            }

            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
