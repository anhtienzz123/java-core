package io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Set;

public class SelectorsWithChannels {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        
        ServerSocket socker =  serverSocketChannel.socket();
        socker.bind(new InetSocketAddress(8180));
        
        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        
        while(true) {
            System.out.println("Waiting for Events...");
            int select = selector.select();
            System.out.println("Event: " + select);
            
            Set<SelectionKey> keys = selector.selectedKeys();
            
            for (SelectionKey key : keys) {
                if( (key.readyOps() & SelectionKey.OP_ACCEPT) ==  SelectionKey.OP_ACCEPT) {
                    // Accepted
                    ServerSocketChannel channel = (ServerSocketChannel) key.channel();
                    SocketChannel socketChannel =   channel.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector, SelectionKey.OP_READ);
                    
                    keys.remove(key);
                }
                
                if((key.readyOps() & SelectionKey.OP_READ) ==  SelectionKey.OP_READ) {
                    // read
                    System.out.println("Reading from connection: ");
                    SocketChannel socketChannel = (SocketChannel) key.channel();
                    ByteBuffer buff =  ByteBuffer.allocate(1024);
                    socketChannel.read(buff);
                    buff.flip();
                    
                    CharBuffer decode = StandardCharsets.UTF_8.decode(buff);
                    System.out.println(new String(decode.array()));
                    
                    keys.remove(key);
                    key.cancel();
                    socketChannel.close();
                }
            }
        }
    }
}
