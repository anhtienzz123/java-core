package io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CharsetsAndCharBuffers {

    public static void main(String[] args) {
        String str = "hello word";
        CharBuffer charBuffer = CharBuffer.allocate(1024);
        charBuffer.put(str);
        charBuffer.flip();

        Charset utf8 = StandardCharsets.UTF_8;
        ByteBuffer byteBuffer = utf8.encode(charBuffer);

        Path path = Paths.get("C:/Users/hatien/Desktop/test/javaio/charsetsandcharbuffers.txt");
        try (FileChannel fileChannel =
                FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            byteBuffer.clear();
            fileChannel.write(byteBuffer);
            byteBuffer.flip();

            CharBuffer decodedBuffer = utf8.decode(byteBuffer);
            try {
                while (true) {
                    System.out.print(decodedBuffer.get());
                }
            } catch (Exception e) {
                System.out.println("\nDone read");
            }
        } catch (Exception e) {

        }
    }
}
