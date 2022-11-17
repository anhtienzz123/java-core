package comjava.udemy.designpattern.structural.facade;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(1, "order 1");
        
        sendOrderEmailWithoutFacade(order);
        
        EmailFacade emailFacade = new EmailFacade();
        emailFacade.sendOrderEmail(order);
    }
    
    private static void sendOrderEmailWithoutFacade(Order order) {
        Template template = TemplateFactory.createTemplateFor(TemplateType.EMAIL);
        Email email = Email.builder().template(template).order(order).build();
        Mailer mailer = Mailer.getMailer();
        mailer.send(email);
    }
}
