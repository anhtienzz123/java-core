package comjava.udemy.designpattern.behavioral.interpreter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Terminal expression
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permission implements PermissionExpression {

    private String permission;

    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(permission);
    }
}
