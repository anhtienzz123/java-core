package comjava.udemy.designpattern.structural.composite;

public class Main {

    public static void main(String[] args) {
        System.out.println("== root 1");
        File root1 = createTreeOne();
        root1.ls();
        
        System.out.println("== root 2");
        File root2 = createTreeTwo();
        root2.ls();   
    }
    
    private static File createTreeOne() {
        File file1 = new BinaryFile("file1", 1000);
        Directory directory1 = new Directory("directory1");
        directory1.addFile(file1);
        
        File file2 = new BinaryFile("file2", 2000);
        File file3 = new BinaryFile("file3", 3000);
        Directory directory2 = new Directory("directory2");
        directory2.addFile(file2);
        directory2.addFile(file3);
        directory2.addFile(directory1);
        return directory2;
    }
    
    private static File createTreeTwo() {
        return new BinaryFile("another file", 200);
    }
}
