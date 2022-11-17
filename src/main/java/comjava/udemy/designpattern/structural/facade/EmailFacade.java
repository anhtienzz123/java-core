package comjava.udemy.designpattern.structural.facade;

public class EmailFacade {

    public void sendOrderEmail(Order order) {
        Template template = TemplateFactory.createTemplateFor(TemplateType.EMAIL);
        Email email = Email.builder().template(template).order(order).build();
        Mailer mailer = Mailer.getMailer();
        mailer.send(email);
    }
}
