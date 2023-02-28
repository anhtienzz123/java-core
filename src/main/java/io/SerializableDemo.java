package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class SerializableDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product product = new Product(1, "product 1", "description 1");
        
        // write object
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C:/Users/hatien/Desktop/test/javaio/product.ser"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
        
        objectOutputStream.writeObject(product);
        
        objectOutputStream.close();
        bufferedOutputStream.close();
        
        // read object
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:/Users/hatien/Desktop/test/javaio/product.ser"));
        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
        
        Product readProduct = (Product) objectInputStream.readObject();
        System.out.println("product: " + readProduct);
        
        bufferedInputStream.close();
        objectInputStream.close();
    }
}


@Data
@NoArgsConstructor
@AllArgsConstructor
class Product implements Serializable{

    private static final long serialVersionUID = 7902282638862913080L;

    private int id;

    private String name;

    private String description;
}
