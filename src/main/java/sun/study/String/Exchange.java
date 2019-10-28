package sun.study.String;

public class Exchange {

    public static void main(String[] args){
        int i = 123;
        byte b = intToByte(i);
        System.out.println("byte b = " + b);
        int x = byteToInt(b);
        System.out.println("int x = " + x);
        int y = 456;
        byte[] bs = intToByteArray(y);
        System.out.println("byte[] bs = " + bs);
        int z = byteArrayToInt(bs);
        System.out.print("int z = " + z);
    }

    public static byte intToByte(int i){
        return (byte)i;
    }

    public static int byteToInt(byte b){
        return b & 0xFF;
    }

    public static byte[] intToByteArray(int i){
        return new byte[]{
                (byte)((i>>24) & 0xFF),
                (byte)((i>>16) & 0xFF),
                (byte)((i>>8) & 0xFF),
                (byte)(i & 0xFF),
        };
    }

    public static int byteArrayToInt(byte[] b){

        return b[3] & 0xFF |
                (b[2] & 0xFF) << 8 |
                (b[1] & 0xFF) << 16 |
                (b[0] & 0xFF) << 24;
    }

}
