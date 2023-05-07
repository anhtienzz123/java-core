package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) throws IOException {
        System.out.println("-- Client start");
        Socket socket = new Socket("localhost", 8080);

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // send message
            String message = scanner.nextLine();
            dataOutputStream.writeUTF(message);
            dataOutputStream.flush();

            if (message.equals("q")) {
                break;
            }

            // read server message
            String serverMessage = dataInputStream.readUTF();
            System.out.println("Server message: " + serverMessage);
        }

        dataOutputStream.close();
        dataInputStream.close();
        socket.close();
        scanner.close();
        System.out.println("-- Client end");
    }
}
