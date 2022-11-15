package comjava.udemy.designpattern.creational.factorymethod;

public abstract class Message {

    public abstract String getContent();

    public void encrypt() {
        System.out.println("Encrypt");
    }
}
