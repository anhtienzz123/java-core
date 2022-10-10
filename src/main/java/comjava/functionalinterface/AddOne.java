package comjava.functionalinterface;

import java.util.function.LongUnaryOperator;

public class AddOne implements LongUnaryOperator {

    @Override
    public long applyAsLong(long operand) {
        return operand + 1;
    }
}
