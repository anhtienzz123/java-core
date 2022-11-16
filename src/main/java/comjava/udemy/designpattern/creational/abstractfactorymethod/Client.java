package comjava.udemy.designpattern.creational.abstractfactorymethod;

public class Client {

    private ResourceFactory factory;
    
    public Client(ResourceFactory factory) {
        this.factory = factory;
    }
    
    public Instance createService(Capacity capacity, int storageMib) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }
}
