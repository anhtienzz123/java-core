package comjava.inheritance;

public interface Interface1 {

    void test();

    default void defaultMethod() {
        System.out.println("Interface1 default method");
    }
}
