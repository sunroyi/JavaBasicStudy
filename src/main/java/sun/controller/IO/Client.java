package sun.controller.IO;

import org.apache.tomcat.jni.Address;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class Client {

    private static String ADDRESS = "127.0.0.1";
    private static int PORT = 5000;

    public static void main(String[] args){

        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            socket = new Socket(ADDRESS, PORT);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            // send message to server
            out.println("Get Client Data1.");
            out.println("Get Client Data2..");
            out.println("Get Client Data3...");
            String response = in.readLine();
            System.out.println(new Date());
            System.out.println("Client:" + response);

            System.exit(0);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
