package io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class ClientCode {
 
    public static void main(String[] args) throws IOException {
        InetSocketAddress address = new InetSocketAddress("localhost", 8180);
        SocketChannel channel  = SocketChannel.open(address);
        Socket socket = channel.socket();
        
        CharBuffer charBuffer = CharBuffer.allocate(1024);
        charBuffer.put("Hey this is the content");
        charBuffer.flip();
        
        ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(charBuffer);
        channel.write(byteBuffer);
        
        socket.close();
    }
}
