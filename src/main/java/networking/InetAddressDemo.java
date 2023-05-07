package networking;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

public class InetAddressDemo {

    public static void main(String[] args) throws UnknownHostException, MalformedURLException {
        InetAddress inetAddress = InetAddress.getByName("github.com");
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());
    }
}
