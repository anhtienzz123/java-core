package comjava.functionalinterface;

import java.util.function.Function;

public class AddTwo implements Function<Long, Long> {

    @Override
    public Long apply(Long t) {
        return t + 2;
    }

}
