package comjava.udemy.designpattern.behavioral.nullobject;

public class Main {

    public static void main(String[] args) {
        StorageService storageService = new StorageService();
        ComplexService complexService = new ComplexService("report name", storageService);
        complexService.generateReport();

        System.out.println("== null object");
        StorageService nullStorageService = new NullStorageService();
        complexService = new ComplexService("report name", nullStorageService);
        complexService.generateReport();
    }
}
