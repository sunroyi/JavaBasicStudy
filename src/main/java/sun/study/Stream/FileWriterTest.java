package sun.study.Stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("D:\\workspace\\JavaBasicStudy\\resource\\FileWriterTest.txt");

        fw.write("你好2");
        fw.close();
    }
}
