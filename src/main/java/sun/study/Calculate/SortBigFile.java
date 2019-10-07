package sun.study.Calculate;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.Arrays;

public class SortBigFile {

    public static void main(String[] args){

        File fileIn = new File("D:\\workspace\\JavaBasicStudy\\resource\\SortSource.txt");

        try {
            InputStream fi = new FileInputStream(fileIn);

            byte[] bs = new byte[100];
            int b =0;
            int index = 0;

            // 文件分割
            while((b=fi.read(bs)) != -1) {
                File fileOut = new File("D:\\workspace\\JavaBasicStudy\\resource\\SortTarget-0-" + index + ".txt");
                if (!fileOut.exists())
                    fileOut.createNewFile();
                OutputStream fo = new FileOutputStream(fileOut);

                String[] array = (new String(bs)).split(",");

                // 消除非数字
                for(int i=0;i<array.length;i++){
                    if (!StringUtils.isNumeric(array[i])){
                        array = arrayRemove(array, i);
                        i--;
                    }
                }

                for(int i=0;i<array.length;i++){
                    for(int j=i+1;j<array.length;j++) {
                        if (Integer.parseInt(array[i]) > Integer.parseInt(array[j])) {
                            String temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }

                StringBuilder strOut = new StringBuilder();
                for(int i=0;i<array.length;i++){
                    strOut.append(array[i]);
                    if (i<array.length-1)
                        strOut.append(",");
                }
                byte[] byteOut = strOut.toString().getBytes();

                fo.write(byteOut);
                fo.flush();
                fo.close();
                index++;
            }

            // 文件合并
            mergeFile(0, 0, index-1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] arrayRemove(String array[], int index) {
        //数组的删除其实就是覆盖前一位
        String[] arrNew = new String[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (i < index) {
                arrNew[i] = array[i];
            } else {
                arrNew[i] = array[i + 1];
            }
        }
        return arrNew;
    }

    public static void mergeFile(int tag, int number1, int number2){

        StringBuilder strSort = new StringBuilder();

        for(int i=number1;i<number2;i++) {
            File fileIn = new File("D:\\workspace\\JavaBasicStudy\\resource\\SortTarget" + "-" + tag + "-" + i + ".txt");

            try {
                InputStream is = new FileInputStream(fileIn);
                byte[] bs = new byte[1024];
                int a=0;

                while((a=is.read(bs)) != -1){
                    strSort.append(new String(bs)).append(",");
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String[] array = strSort.toString().substring(0, strSort.length()-1).split(",");


        // 消除非数字
        for(int i=0;i<array.length;i++){
            if (!StringUtils.isNumeric(array[i])){
                array = arrayRemove(array, i);
                i--;
            }
        }

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++) {
                if (Integer.parseInt(array[i]) > Integer.parseInt(array[j])) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        StringBuilder strOut = new StringBuilder();

        for(int i=0;i<array.length;i++){
            strOut.append(array[i]);
            if (i<array.length-1)
                strOut.append(",");
        }

        File fileOut = new File("D:\\workspace\\JavaBasicStudy\\resource\\SortTarget" + "-Output.txt");
        OutputStream os = null;
        try {
            os = new FileOutputStream(fileOut);
            os.write(strOut.toString().getBytes());
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
