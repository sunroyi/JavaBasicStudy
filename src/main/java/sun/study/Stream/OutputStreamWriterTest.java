package sun.study.Stream;

import java.io.*;

public class OutputStreamWriterTest {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("D:\\workspace\\JavaBasicStudy\\resource\\OutputStreamWriterTest.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        osw.write("你好1");

        osw.close();

    }
}
