package networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

    public static void main(String[] args) throws IOException {
        System.out.println("-- Server start");
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("localhost");

        String message = "Hello word";
        DatagramPacket datagramPacket =
                new DatagramPacket(message.getBytes(), message.length(), ip, 8080);
        datagramSocket.send(datagramPacket);

        datagramSocket.close();
        System.out.println("-- Server end");
    }
}
