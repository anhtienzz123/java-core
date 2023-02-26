package networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

    public static void main(String[] args) throws IOException {
        System.out.println("-- Client start");
        InetAddress ip = InetAddress.getByName("localhost");
        DatagramSocket socket = new DatagramSocket(8080, ip);

        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        socket.receive(datagramPacket);

        String str = new String(datagramPacket.getData(), 0, buf.length);
        System.out.println(str);

        socket.close();
        System.out.println("-- Client end");
    }
}
