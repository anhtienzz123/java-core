package security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHADemo {

    public static void main(String[] args) {
        try {
            // Create a MessageDigest instance for SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Input data to be hashed
            String input = "Hello, world!";

            // Convert the input data to bytes and hash it
            byte[] hash = md.digest(input.getBytes());

            // Convert the hash bytes to a hex string representation
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }

            // Print the hash
            System.out.println("SHA-256 hash: " + hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("SHA-256 algorithm not available");
        }
    }
}
