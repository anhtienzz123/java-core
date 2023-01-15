package comjava.udemy.designpattern.behavioral.interpreter;

public interface PermissionExpression {

    boolean interpret(User user);
}
