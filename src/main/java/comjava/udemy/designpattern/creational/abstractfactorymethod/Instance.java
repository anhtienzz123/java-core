package comjava.udemy.designpattern.creational.abstractfactorymethod;

public interface Instance {

    void start();
    
    void attachStorage(Storage storage);
    
    void stop();
}
