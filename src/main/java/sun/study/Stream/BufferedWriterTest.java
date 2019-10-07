package sun.study.Stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("D:\\workspace\\JavaBasicStudy\\resource\\BufferedWriterTest.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("你好3");

        bw.close();
        fw.close();

    }
}
