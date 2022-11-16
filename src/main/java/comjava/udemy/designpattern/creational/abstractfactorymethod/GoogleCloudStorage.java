package comjava.udemy.designpattern.creational.abstractfactorymethod;

public class GoogleCloudStorage implements Storage{

    public GoogleCloudStorage(int capacity) {
        System.out.println("Allocated " + capacity + " on GoogleCloudStorage");
    }
    
    @Override
    public String getId() {
       return "gcpcs1";
    }
    
    @Override
    public String toString() {
       return "GoogleCloudStorage";
    }
}
