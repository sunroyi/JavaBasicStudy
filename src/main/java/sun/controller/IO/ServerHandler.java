package sun.controller.IO;

import java.io.*;
import java.net.Socket;
import java.util.Date;

public class ServerHandler implements Runnable {

    private Socket socket;

    public ServerHandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            String body = null;
            while(true){
                body = in.readLine();
                if (body == null)
                    break;

                System.out.println(new Date());
                System.out.println("Server Body:" + body);

                out.println("Server Data Back.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
