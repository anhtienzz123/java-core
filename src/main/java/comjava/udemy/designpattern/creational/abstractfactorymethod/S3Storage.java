package comjava.udemy.designpattern.creational.abstractfactorymethod;

public class S3Storage implements Storage{

    public S3Storage(int capacity) {
        System.out.println("Allocated " + capacity + " on S3Storage");
    }
    
    @Override
    public String getId() {
       return "S31";
    }
    
    @Override
    public String toString() {
       return "S3Storage";
    }
}
