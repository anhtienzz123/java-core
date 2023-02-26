package networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("-- Server start");
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        String str = dataInputStream.readUTF();
        System.out.println(str);

        serverSocket.close();
        System.out.println("-- Server end");
    }

}
