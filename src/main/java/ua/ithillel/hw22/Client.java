package ua.ithillel.hw22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (Socket socket = new Socket("127.0.0.1", 8080)) {
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            while (true){
                String text = scanner.nextLine();
                if (text.equals("exit")){
                    break;
                }
                dataOutputStream.writeUTF(text);
                dataOutputStream.flush();
                String response = dataInputStream.readUTF();
                System.out.println("Server: " +response);
            }

        }
    }
}
