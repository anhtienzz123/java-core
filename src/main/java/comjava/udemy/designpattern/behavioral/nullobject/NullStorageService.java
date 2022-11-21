package comjava.udemy.designpattern.behavioral.nullobject;

public class NullStorageService extends StorageService {

    @Override
    public void save(Report report) {
        System.out.println("Do nothing save report");
    }
}
