package comjava.udemy.designpattern.creational.abstractfactorymethod;

public interface ResourceFactory {

    Instance createInstance(Capacity capacity);
    
    Storage createStorage(int capMib);
}
