package comjava.udemy.designpattern.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Message message = new TextMessage("The text message");
        System.out.println(message.getContent());
        
        message = new HtmlEncodedMessage(message); 
        System.out.println(message.getContent());
        
        message = new Base64EncodedMessage(message); 
        System.out.println(message.getContent());
    }
}
