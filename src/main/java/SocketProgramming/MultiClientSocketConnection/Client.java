package SocketProgramming.MultiClientSocketConnection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by timmanas on 2018-07-29.
 */
public class Client {

    //region Constructor
    public Client() {
    }
    //endregion

    //region MAIN
    public static void main(String [] args)  {

        try {
            Scanner scanner = new Scanner(System.in);

            // Get the Local ip Host
            InetAddress  ip = InetAddress.getByName("localhost");

            // Establish a connection with Server Port 5056
            Socket socket = new Socket(ip, 5056);

            // Fetch the input and output Stream
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            // This while loop
            while(true) {
                System.out.println(dataInputStream.readUTF());
                String toSend = scanner.nextLine();

                // This is the line which sends the instruction to the Server
                dataOutputStream.writeUTF(toSend);

                System.out.println("String toSend: " + toSend);

                if(toSend.equalsIgnoreCase("Exit")) {
                    System.out.println("Closing this connection: " + socket);
                    socket.close();
                    System.out.println("Connection Closed");
                    break;
                }

                String received = dataInputStream.readUTF();
                System.out.println("Received: " + received);
            }

            System.out.println("Closing the Client Connection");
            scanner.close();
            dataInputStream.close();
            dataOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
    //endregion

    //region Helpers

    //endregion



}


