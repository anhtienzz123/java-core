package security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESDemo {

    public static void main(String[] args) throws Exception {
        String plainText = "This is a secret message";
        String encryptionKey = "mySecretKey123";

        // Generate the secret key
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();

        // Encrypt the plain text
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedText = cipher.doFinal(plainText.getBytes("UTF-8"));

        // Decrypt the encrypted text
        cipher.init(Cipher.DECRYPT_MODE, secretKey, cipher.getParameters());
        byte[] decryptedText = cipher.doFinal(encryptedText);
        String decryptedTextString = new String(decryptedText, "UTF-8");

        // Print the results
        System.out.println("Plain text: " + plainText);
        System.out.println("Encrypted text: " + bytesToHex(encryptedText));
        System.out.println("Decrypted text: " + decryptedTextString);
    }

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            int v = bytes[i] & 0xFF;
            hexChars[i * 2] = HEX_ARRAY[v >>> 4];
            hexChars[i * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
