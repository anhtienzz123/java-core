package comjava.udemy.designpattern.behavioral.interpreter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Non-terminal expression
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotExpression implements PermissionExpression {

    private PermissionExpression expression1;


    @Override
    public boolean interpret(User user) {
        return !expression1.interpret(user);
    }
}
