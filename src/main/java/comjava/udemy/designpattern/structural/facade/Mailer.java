package comjava.udemy.designpattern.structural.facade;

import lombok.Data;

@Data
public class Mailer {

    private Mailer() {
        
    }
    
    public static Mailer getMailer() {
        return new Mailer();
    }
    
    public void send(Email email) {
        System.out.println("send email: " + email);
    }
}
