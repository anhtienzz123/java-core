package comjava.functionalinterface;

import java.util.function.BinaryOperator;

public class LongBinaryOperator implements BinaryOperator<Long> {

    @Override
    public Long apply(Long t, Long u) {
        return t + u;
    }
}
