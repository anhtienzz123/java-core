package networking;

import java.io.IOException;

public class Ping {

    public static void main(String[] args) throws IOException {
        Process process = Runtime.getRuntime().exec("ping github.com");
    }
}
