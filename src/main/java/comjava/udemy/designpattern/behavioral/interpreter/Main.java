package comjava.udemy.designpattern.behavioral.interpreter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Report report1 = new Report("report 1", "admin");
        ExpressionBuilder builder = new ExpressionBuilder();

        PermissionExpression exp = builder.build(report1);
        System.out.println(exp);

        User user1 = new User("user 1", Arrays.asList("user", "admin"));

        System.out.println("user access report: " + exp.interpret(user1));
    }
}
