package comjava.udemy.designpattern.structural.decorator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Base64EncodedMessage implements Message{

    private Message message;

    @Override
    public String getContent() {
      return message.getContent() + ": base64encoded";
    }
}
