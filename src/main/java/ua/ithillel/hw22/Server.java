package ua.ithillel.hw22;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8080)){
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            while (true){
                String clientMes = dataInputStream.readUTF();
                System.out.println("Client: " + clientMes);
                dataOutputStream.writeUTF("Server: " + clientMes);
                dataOutputStream.flush();

            }
        }



    }
}
