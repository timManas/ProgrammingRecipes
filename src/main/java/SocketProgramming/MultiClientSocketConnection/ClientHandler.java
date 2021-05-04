package SocketProgramming.MultiClientSocketConnection;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by timmanas on 2018-07-29.
 */
public class ClientHandler extends Thread {

    //region Members
    DateFormat forDate = new SimpleDateFormat("yyyy/MM/dd");
    DateFormat forTime = new SimpleDateFormat("hh:mm:ss");
    final DataInputStream dataInputStream;
    final DataOutputStream dataOutputStream;
    final Socket socket;
    //endregion

    //region Constructor
    public ClientHandler(Socket socket, DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
        this.socket = socket;
        this.dataInputStream = dataInputStream;
        this.dataOutputStream = dataOutputStream;
    }
    //endregion

    //region Functions
    @Override
    public void run() {
        String received;
        String toReturn;

        // Set an infinite Loop to communicate with the Server
        while(true) {

            try {

                dataOutputStream.writeUTF("Chose one of the of following Options: \n1. Date \n2. Time");

                // Fetch the answer from the Client
                received = dataInputStream.readUTF();
                System.out.println("Received Instruction: " + received);

                if(received.equalsIgnoreCase("Exit")) {
                    System.out.println("Client: " + this.socket + "  sends Exit");
                    System.out.print("Closing connection");
                    this.socket.close();

                    System.out.println("Connection Closed");
                    break;
                }

                // Write the output stream based on the input
                Date date = new Date();
                switch (received) {

                    case "Date": {
                        toReturn = forDate.format(date);
                        System.out.println("Sending Date ");
                        dataOutputStream.writeUTF(toReturn);
                        break;
                    }

                    case "Time": {
                        toReturn = forTime.format(date);
                        System.out.println("Sending Time ");
                        dataOutputStream.writeUTF(toReturn);
                        break;
                    }

                    default:
                        dataOutputStream.writeUTF("Invalid Option");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try {
            dataInputStream.close();
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
    //endregion
}


