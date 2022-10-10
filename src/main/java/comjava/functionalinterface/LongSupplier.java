package comjava.functionalinterface;

import java.util.function.Supplier;

public class LongSupplier implements Supplier<Long> {

    @Override
    public Long get() {
        return 1L;
    }
}
