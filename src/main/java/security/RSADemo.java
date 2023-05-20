package security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;

public class RSADemo {

    public static void main(String[] args) throws Exception {
        // Generate an RSA key pair with a key size of 2048 bits
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Get the public and private keys from the key pair
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // Create a Cipher object for encryption and decryption
        Cipher cipher = Cipher.getInstance("RSA");

        // Encrypt a message using the public key
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        String message = "This is a secret message.";
        byte[] encryptedMessage = cipher.doFinal(message.getBytes());

        // Decrypt the message using the private key
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedMessage = cipher.doFinal(encryptedMessage);

        // Print the original message and the decrypted message
        System.out.println("Original message: " + message);
        System.out.println("Decrypted message: " + new String(decryptedMessage));
    }
}
