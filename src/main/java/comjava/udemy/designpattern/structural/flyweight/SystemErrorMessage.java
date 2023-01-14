package comjava.udemy.designpattern.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemErrorMessage implements ErrorrMessage {

    private String errorTemplate;

    @Override
    public String getText(String code) {
        return errorTemplate.replace("$code", code);
    }

}
