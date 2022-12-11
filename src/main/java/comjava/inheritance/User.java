package comjava.inheritance;

public class User implements Interface1, Interface2 {

    protected int id;

    public static void staticMethod() {
        System.out.println("User: staticMethod");

    }

    public String getFullInfo() {
        return "info";
    }

    @Override
    public void test() {
        // TODO Auto-generated method stub

    }

    @Override
    public void defaultMethod() {
        // TODO Auto-generated method stub
        Interface1.super.defaultMethod();
    }
}
