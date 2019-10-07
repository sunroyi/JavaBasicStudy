package sun.study.Serialize;

import java.io.*;

public class SerializeTest1 {
    // 序列化
    public static byte[] serialize(Object object){
        ObjectOutputStream oos = null;
        ByteArrayOutputStream baos = null;

        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            byte[] bytes = baos.toByteArray();
            return bytes;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (baos != null) {
                    baos.close();
                }
                if (oos != null){
                    oos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    // 反序列化
    public static Object deserialize(byte[] bytes){
        ObjectInputStream ois = null;
        ByteArrayInputStream bais = null;

        try {
            bais = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args){
        SerializeClass sc = new SerializeClass(1, "Steven");

        SerializeClass rsc = (SerializeClass) deserialize(serialize(sc));

        System.out.println(rsc.getId());
        System.out.println(rsc.getName());
    }
}
