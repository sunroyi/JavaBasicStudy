package sun.study.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\workspace\\JavaBasicStudy\\resource\\BufferedOutputStreamTest.txt"));

        int len;

        while((len = isr.read()) != -1)
            System.out.println((char)len);

        isr.close();
    }
}
