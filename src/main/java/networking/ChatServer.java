package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

    public static void main(String[] args) throws IOException {
        System.out.println("-- Server start");
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // read client message
            String clientMessage = dataInputStream.readUTF();
            if (clientMessage.equals("q")) {
                break;
            }
            System.out.println("Client message: " + clientMessage);

            // response message
            String serverMessage = scanner.nextLine();
            dataOutputStream.writeUTF(serverMessage);
            dataOutputStream.flush();
        }

        dataOutputStream.close();
        dataInputStream.close();
        socket.close();
        scanner.close();
        serverSocket.close();
        System.out.println("-- Server end");
    }
}
