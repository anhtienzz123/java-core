package networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("-- Client connect");
        Socket socket = new Socket("localhost", 8080);

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF("hello word");
        dataOutputStream.flush();

        dataOutputStream.close();
        socket.close();
        System.out.println("-- Client end");
    }
}
