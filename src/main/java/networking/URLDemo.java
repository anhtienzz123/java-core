package networking;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://github.com/anhtienzz123");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getFile());
    }
}
