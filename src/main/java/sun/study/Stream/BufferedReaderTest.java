package sun.study.Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("D:\\workspace\\JavaBasicStudy\\resource\\BufferedOutputStreamTest.txt");

        BufferedReader br = new BufferedReader(fr);

        String line;

        while((line=br.readLine()) != null)
            System.out.println(line);

        fr.close();

    }
}
