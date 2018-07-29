package SocketProgramming.MultiClientSocketConnection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by timmanas on 2018-07-29.
 */
public class Server {

    //region Members

    //endregion

    //region Main
    public static void main(String [] args) throws IOException {

        int port = 5056;

        // Server is listening to Port 5056
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // We use an infinite Loop to get Client request
        while(true) {

            System.out.println("Waiting for New Client ...\n");
            Socket socket = null;
            try {

                // Socket object to receive incoming messages
                socket = serverSocket.accept();

                System.out.println("A new client is connected\n");

                // Fetch the input and output Streams
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

                System.out.println("Assigning a new thread for this client");


                // Create a new thread for this client
                Thread thread = new ClientHandler(socket, dataInputStream, dataOutputStream);
                thread.start();


            } catch (IOException e) {
                socket.close();
                e.printStackTrace();
            }


        }

    }
    //endregion


}



/**

 I. Server

 What ?
 - Can Accept multiple Client

 How ?
 - Creating a new thread for each new Client
 - A while loop is created to handle the communication betwee the Client and the server

 Why ?
 - We do not want only one client for every Server
 - We need a way to handle multiple clients logging into the same server at the SAME TIME
 - Hence need to use multiple threads  for each Client request which comes in

 What does this class do ?
 - Establish the connection - using  ServerSocket
 - Obtains the Streams
 - Create a handler Object for each new Client
 - Invoke the Start Method




 II. Client Handler

 What ?
 - Responsible for creating a thread
 - Creating a new thread for each new Client

 What does this class do ?
 - Fetches the Input & Output Streams
 - Performs the actual action of sending the date or Time
 - Sends data back the Client



 III. Client

 What ?
 - In the client we need to follow these steps
 1. Establish a Socket Connection
 2. Communicate with the Server

 */
