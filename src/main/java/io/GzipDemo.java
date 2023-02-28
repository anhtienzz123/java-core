package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipDemo {

    static String FILE_TO_COMPRESS = "C:/Users/hatien/Desktop/test/javaio/video.mp4";
    static String FILE_TO_WRITE = "C:/Users/hatien/Desktop/test/javaio/video.gz";
    static String FILE_TO_DECOMPRESS = "C:/Users/hatien/Desktop/test/javaio/video1.mp4";
    
    public static void main(String[] args) throws IOException {
        System.out.println("Original Size: " + Files.size(Paths.get(FILE_TO_COMPRESS)));
        //compress();
        decompress();
    }
    
    static void compress() {
        
        byte[] buffer = new byte[1024];
        try {
            FileInputStream is = new FileInputStream(FILE_TO_COMPRESS);
            GZIPOutputStream os = new GZIPOutputStream(new FileOutputStream(FILE_TO_WRITE));

            int size; 
            while( (size = is.read(buffer)) != -1 ) {
                os.write(buffer, 0, size);
            }
            
            is.close();
            os.finish();
            os.close();
            
            System.out.println("File is compressed to the size " + Files.size(Paths.get(FILE_TO_WRITE)));
        } catch (Exception e) {
           e.printStackTrace(); 
        }
    }
    
    static void decompress() {
        byte[] buffer = new byte[1024];
        try {
            GZIPInputStream is = new GZIPInputStream(new FileInputStream(FILE_TO_WRITE));
            FileOutputStream os = new FileOutputStream(FILE_TO_DECOMPRESS);
            
            int size;
            while((size = is.read(buffer)) != -1) {
                os.write(buffer, 0, size);
            }
            
            os.close();
            is.close();
            
            System.out.println("File is decompressed with size " + Files.size(Paths.get(FILE_TO_DECOMPRESS)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
