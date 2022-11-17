package comjava.udemy.designpattern.structural.facade;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Email {
    
    private Template template;
    
    private Order order;
}
