package io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ChannelAndBufferDemo {

    public static void main(String[] args) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.putInt(12);
        buffer.putInt(13);
//
//        System.out.println("pos: " + buffer.position());
//        System.out.println("limit: " + buffer.limit());

        buffer.flip();

//        System.out.println("pos: " + buffer.position());
//        System.out.println("limit: " + buffer.limit());

        Path path = Paths.get("C:/Users/hatien/Desktop/test/javaio/channelbuffer.txt");
        FileChannel fileChannel =
                FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        fileChannel.write(buffer);
        fileChannel.close();
        
        FileChannel readChannel = FileChannel.open(path, StandardOpenOption.READ);
        buffer.clear();
        readChannel.read(buffer);
        readChannel.close();
        
        buffer.flip();
        
        IntBuffer intBuffer = buffer.asIntBuffer();
        
        try {
            while(true) {
                System.out.println(intBuffer.get());
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
}
