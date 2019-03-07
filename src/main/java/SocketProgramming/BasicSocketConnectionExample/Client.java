package SocketProgramming.BasicSocketConnectionExample;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by timmanas on 2018-07-25.
 */
public class Client {

    //region Members
    private Socket socket = null;
    private DataInputStream inputStream = null;
    private DataOutputStream outputStream = null;
    //endregion

    //region Constructor
    public Client(String address, int port) {

        try {
            // Create a socket connection
            socket = new Socket(address, port);
            System.out.println("Socket Connected");

            // Create a way to accept data
            inputStream = new DataInputStream(System.in);

            // Create a way to output data
            outputStream = new DataOutputStream(socket.getOutputStream());


        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the data
        System.out.println("Please Enter your message:\n");
        String line = "";
        while(!line.equalsIgnoreCase("Over")) {

            try {
                line = inputStream.readLine();
                outputStream.writeUTF(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        // Close connection
        try {
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //endregion

    //region Main
    public static void main(String [] args) {
        Client client = new Client("127.0.0.1", 5000);
    }
    //endregion
}


/**

 Socket Programming

 What ?
 - Connect two machines which shares information
 - Client connects to server
 - Client sends message
 - Message shows up in Server

 How ?
 - A port is established which sets up the channel where the communication happens
 - Both machines needs to connect to the same port
 - Note the server, does not need to know about the Host IP address but the Client does

 Note
 - the accept() method just sits there until a connection has been established with the client
 - The server makes a new socket to communicate with client
 - ServerSocket only Exists on the Server side
 - Socket only exists within the client side

 Server

 What ?

 Why ?


 How ?




 How to Run
 1. Start Server ...i.e Run the Server main class
 2. Start Client ....i.e Run the Clinet main clas
 3. Type messages on Client
 4. Notice messages apepar on client
 */