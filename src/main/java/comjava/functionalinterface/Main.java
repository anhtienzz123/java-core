package comjava.functionalinterface;

public class Main {

    public static void main(String[] args) {

        // Function
        Long longResult = 1L;
        AddOne addOne = new AddOne();
        AddTwo addTwo = new AddTwo();
        longResult = addOne.applyAsLong(longResult);
        longResult = addTwo.apply(longResult);
        System.out.println("result: " + longResult);

        // Predicate
        CheckForNull checkForNull = new CheckForNull();
        System.out.println("result: " + checkForNull.test(null));

        // UnaryOperator
        LongUnaryOperator longUnaryOperator = new LongUnaryOperator();
        System.out.println("result: " + longUnaryOperator.apply(1L));

        // BinaryOperator
        LongBinaryOperator longBinaryOperator = new LongBinaryOperator();
        System.out.println("result: " + longBinaryOperator.apply(1L, 2L));
        
        // Supplier
        LongSupplier longSupplier = new LongSupplier();
        System.out.println("result: " + longSupplier.get());
        
        // Consumer
        LongConsumer longConsumer = new LongConsumer();
        longConsumer.accept(1L);
    }
}
