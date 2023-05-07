package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:/Users/hatien/Desktop/test/javaio/input.text");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        
        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/hatien/Desktop/test/javaio/input.text");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        
        InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedOutputStream);
        outputStreamWriter.write("hello word");
    }
}
