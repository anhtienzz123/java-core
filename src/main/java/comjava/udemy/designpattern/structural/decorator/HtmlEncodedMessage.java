package comjava.udemy.designpattern.structural.decorator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class HtmlEncodedMessage implements Message{

    private Message message;
    
    @Override
    public String getContent() {
        return message.getContent() + ": html encoded";
    }
}
