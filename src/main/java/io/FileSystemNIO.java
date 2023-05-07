package io;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.List;

public class FileSystemNIO {

    public static void main(String[] args) {
        List<FileSystemProvider> providers = FileSystemProvider.installedProviders();
        //providers.forEach(ele -> System.out.println(ele));
        
        FileSystem defaultFileSystem = FileSystems.getDefault();
        System.out.println(defaultFileSystem);
        
        System.out.println("-- Root folder");
        for (Path path : defaultFileSystem.getRootDirectories()) {
            System.out.println(path);
        }
        
        System.out.println("-- File");
        for (FileStore fileStore : defaultFileSystem.getFileStores()) {
            System.out.println(fileStore.name() + "-" + fileStore.type());
        }
        
        // to create file, directory
        FileSystemProvider systemProvider = providers.get(0);
        
    }
}
