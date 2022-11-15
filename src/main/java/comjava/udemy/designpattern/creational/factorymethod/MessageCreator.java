package comjava.udemy.designpattern.creational.factorymethod;

public abstract class MessageCreator {

    public Message getMessage() {
        Message message = createMessage();

        message.encrypt();

        return message;
    }

    public abstract Message createMessage();
}
