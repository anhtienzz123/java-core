package comjava.udemy.designpattern.behavioral.interpreter;

import java.util.Stack;
import java.util.StringTokenizer;

public class ExpressionBuilder {

    private Stack<PermissionExpression> permissions = new Stack<>();

    private Stack<String> operators = new Stack<>();

    public PermissionExpression build(Report report) {
        parse(report.getPermission());
        buildExpressions();
        if (permissions.size() > 1 || !operators.isEmpty()) {
            System.out.println("ERROR!");
        }
        return permissions.pop();
    }

    private void parse(String permission) {
        StringTokenizer tokenizer = new StringTokenizer(permission);

        while (tokenizer.hasMoreElements()) {
            String token;
            switch (token = tokenizer.nextToken()) {
                case "and":
                    operators.push("and");
                    break;
                case "or":
                    operators.push("or");
                    break;
                case "not":
                    operators.push("not");
                    break;
                default:
                    permissions.push(new Permission(token));
            }
        }
    }

    private void buildExpressions() {
        while (!operators.isEmpty()) {
            String operator = operators.pop();
            PermissionExpression permission1;
            PermissionExpression permission2;
            PermissionExpression exp;

            switch (operator) {
                case "and":
                    permission1 = permissions.pop();
                    permission2 = permissions.pop();
                    exp = new AndExpression(permission1, permission2);
                    break;
                case "or":
                    permission1 = permissions.pop();
                    permission2 = permissions.pop();
                    exp = new OrExpression(permission1, permission2);
                    break;
                case "not":
                    permission1 = permissions.pop();
                    exp = new NotExpression(permission1);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            permissions.push(exp);
        }
    }
}
