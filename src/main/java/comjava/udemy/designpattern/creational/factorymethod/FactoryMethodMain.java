package comjava.udemy.designpattern.creational.factorymethod;

public class FactoryMethodMain {

    public static void main(String[] args) {
        System.out.println("== text message");
        print(new TextMessageCreator());

        System.out.println("== json message");
        print(new JsonMessageCreator());
    }

    public static void print(MessageCreator messageCreator) {
        System.out.println("message: " + messageCreator.getMessage().getContent());
    }
}
