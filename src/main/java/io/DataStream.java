package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.stream.IntStream;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class DataStream {

    public static void main(String[] args) throws IOException {
        
        // write
        FileOutputStream fileOutputStream =
                new FileOutputStream("C:/Users/hatien/Desktop/test/javaio/datastream.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        List<Item> items = IntStream.range(1, 100)
                .mapToObj(index -> new Item(index, "name " + index, index * 10)).toList();

        for (Item item : items) {
            dataOutputStream.writeInt(item.getId());
            dataOutputStream.writeUTF(item.getName());
            dataOutputStream.writeDouble(item.getCost() );
        }

        // read
        FileInputStream fileInputStream =
                new FileInputStream("C:/Users/hatien/Desktop/test/javaio/datastream.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        try {
            while(true) {
                int id = dataInputStream.readInt();
                String name = dataInputStream.readUTF();
                double cost = dataInputStream.readDouble();
                
                System.out.printf("%d - %s - %f\n", id, name, cost);
            }
            
        } catch (Exception e) {
            System.out.println("Read done");
        }
        
        
        dataOutputStream.close();
        dataInputStream.close();
    }
}


@Data
@NoArgsConstructor
@AllArgsConstructor
class Item {
    private int id;

    private String name;

    private double cost;
}
