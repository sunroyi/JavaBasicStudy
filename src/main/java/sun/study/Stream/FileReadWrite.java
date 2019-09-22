package sun.study.Stream;

import java.io.*;

public class FileReadWrite {

    public static void main(String[] args){

        File fileInput = new File("D:\\workspace\\JavaBasicStudy\\resource\\SearchText.txt");

        File fileOutput = new File("D:\\workspace\\JavaBasicStudy\\resource\\NewText.txt");

        try {
            if (!fileOutput.exists())
                fileOutput.createNewFile();

            InputStream is = new FileInputStream(fileInput);
            OutputStream os = new FileOutputStream(fileOutput);

            byte[]  b = new byte[1024];
            int a=0;
            while((a=is.read(b,0,1024))!=-1){
                os.write(b,0,a);
            }

            os.flush();
            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
