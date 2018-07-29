package SocketProgramming.BasicSocketConnectionExample;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by timmanas on 2018-07-25.
 */
public class Server {

    //region Member
    private Socket socket = null;
    private ServerSocket serverSocket = null;
    private DataInputStream dataInputStream = null;
    //endregion

    //region Constructor
    public Server(int port) {

        // Start port and wait for connection
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Establishing Connection .... ");

            System.out.println("Waiting for client to accept");

            socket = serverSocket.accept();
            System.out.println("Connection Established");

            // Data from Client
            dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String line = "";
            while(!line.equalsIgnoreCase("Over")) {

                line = dataInputStream.readUTF();
                System.out.println(line);
            }


            // Close the connection

            socket.close();
            serverSocket.close();
            dataInputStream.close();



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    //endregion

    //region main
    public static void main(String [] args) {
        Server server = new Server(5000);
    }
    //endregion

}




