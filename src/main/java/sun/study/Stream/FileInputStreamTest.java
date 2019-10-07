package sun.study.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("D:\\workspace\\JavaBasicStudy\\resource\\SearchText.txt");

        byte[] bs = new byte[1024];
        int len = 0;

        while((len = fis.read(bs)) != -1)
            System.out.println(new String(bs, 0, len));

        fis.close();
    }
}
