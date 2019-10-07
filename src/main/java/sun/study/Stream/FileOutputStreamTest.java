package sun.study.Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("D:\\workspace\\JavaBasicStudy\\resource\\FileOutputStreamTest.txt");

        fos.write("Hello World".getBytes());

        fos.close();
    }
}
