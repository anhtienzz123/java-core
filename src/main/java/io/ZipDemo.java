package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipDemo {

    static String ARCHIVE_FOLDER = "C:/Users/hatien/Desktop/test/javaio/archive.zip";

    public static void main(String[] args) throws IOException {
        write();

        read();
    }

    private static void read() {
        try (InputStream in = new FileInputStream(ARCHIVE_FOLDER);
                ZipInputStream zis = new ZipInputStream(in);
                DataInputStream dis = new DataInputStream(zis);) {

            ZipEntry nextEntry = zis.getNextEntry();

            while (nextEntry != null) {
                if (nextEntry.isDirectory()) {
                    System.out.println("Reading: " + nextEntry);
                } else {
                    byte[] bytes = dis.readAllBytes();
                    System.out.println(new String(bytes));
                }

                nextEntry = zis.getNextEntry();
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    private static void write() throws IOException {
        OutputStream os = new FileOutputStream(ARCHIVE_FOLDER);
        ZipOutputStream zos = new ZipOutputStream(os);
        DataOutputStream dos = new DataOutputStream(zos);

        ZipEntry dirEntry = new ZipEntry("BinFiles/");
        zos.putNextEntry(dirEntry);

        ZipEntry fileEntry = new ZipEntry("BinFiles/LineCount.bin");
        zos.putNextEntry(fileEntry);

        IntStream.range(0, 100).forEach(i -> {
            try {
                dos.writeUTF("This is line number: " + (i + 1));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        zos.closeEntry();

        ZipEntry dirEntry1 = new ZipEntry("TextFiles/");
        zos.putNextEntry(dirEntry1);

        ZipEntry fileEntry1 = new ZipEntry("TextFiles/MyFile.txt");
        zos.putNextEntry(fileEntry1);

        dos.writeUTF("This file is to be archived.");
        zos.closeEntry();

        dos.close();
    }
}
