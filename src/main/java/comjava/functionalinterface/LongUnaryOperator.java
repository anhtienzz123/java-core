package comjava.functionalinterface;

import java.util.function.UnaryOperator;

public class LongUnaryOperator implements UnaryOperator<Long> {

    @Override
    public Long apply(Long t) {
        return t;
    }
}
