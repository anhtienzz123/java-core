package comjava;

public class Main {

    public static void main(String[] args) {

        ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 1);
        System.out.println(threadLocalValue.get());
        threadLocalValue.remove();
        System.out.println(threadLocalValue.get());

    }
}
