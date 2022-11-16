package comjava.udemy.designpattern.creational.abstractfactorymethod;

public class GoogleComputeEngineInstance implements Instance{

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Create GoogleComputeEngineInstance");
    }
    
    @Override
    public void start() {
        System.out.println("GoogleComputeEngineInstance start"); 
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to GoogleComputeEngineInstance"); 
        
    }

    @Override
    public void stop() {
       System.out.println("GoogleComputeEngineInstance stop");
    }
    
    @Override
    public String toString() {
       return "GoogleComputeEngineInstance";
    }
}
