package comjava.udemy.designpattern.behavioral.interpreter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Non-terminal expression
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrExpression implements PermissionExpression {

    private PermissionExpression expression1;

    private PermissionExpression expression2;

    @Override
    public boolean interpret(User user) {
        return expression1.interpret(user) || expression2.interpret(user);
    }
}
