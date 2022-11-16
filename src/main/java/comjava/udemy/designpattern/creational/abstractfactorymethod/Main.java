package comjava.udemy.designpattern.creational.abstractfactorymethod;

public class Main {

    public static void main(String[] args) {
        Client awsClient = new Client(new AwsResourceFactory());
        Instance instance = awsClient.createService(Capacity.MICRO, 100);
        instance.start();
        instance.stop();
        
        System.out.println("====");
        Client googleClient = new Client(new GoogleResourceFactory());
        Instance googleInstance = googleClient.createService(Capacity.MICRO, 100);
        googleInstance.start();
        googleInstance.stop();
    }
}
