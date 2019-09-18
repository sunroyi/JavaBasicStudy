package sun.study.IO;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static int PORT = 5000;

    public static void main(String[] args){

        ServerSocket server = null;

        try {
            server = new ServerSocket(PORT);

            System.out.println("Server Start");

            while(true) {
                // 进行阻塞
                Socket socket = server.accept();
                socket.setKeepAlive(true);

                // 新建一个线程执行客户端任务
                new Thread(new ServerHandler(socket)).start();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
