package comjava.udemy.designpattern.creational.abstractfactorymethod;

public class Ec2Instance implements Instance{

    public Ec2Instance(Capacity capacity) {
        System.out.println("Create Ec2Instance");
    }
    
    @Override
    public void start() {
        System.out.println("Ec2Instance start"); 
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Ec2Instance"); 
        
    }

    @Override
    public void stop() {
       System.out.println("Ec2Instance stop");
    }
    
    @Override
    public String toString() {
       return "Ec2Instance";
    }
}
