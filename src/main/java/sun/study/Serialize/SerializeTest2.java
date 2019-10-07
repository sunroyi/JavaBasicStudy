package sun.study.Serialize;

import java.io.*;

public class SerializeTest2 {

    public static void main(String[] args){

        // Write serialize object to file
        File file = new File("D:\\workspace\\JavaBasicStudy\\resource\\SerializeText.txt");

        try {
            if (!file.exists())
                file.createNewFile();

            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SerializeClass sc = new SerializeClass(1, "Sun");

            oos.writeObject(sc);

            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read serialize byte from file
        try {
            FileInputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            SerializeClass scNew = (SerializeClass)ois.readObject();

            System.out.println(scNew.getId());
            System.out.println(scNew.getName());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.exit(0);
    }
}
