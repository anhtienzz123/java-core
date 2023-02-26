package networking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionDemo {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://github.com/anhtienzz123");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        System.out.println(httpURLConnection.getHeaderFields());
    }
}
