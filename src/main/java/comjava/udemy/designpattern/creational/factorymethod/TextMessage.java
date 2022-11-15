package comjava.udemy.designpattern.creational.factorymethod;

public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "text message";
    }
}
