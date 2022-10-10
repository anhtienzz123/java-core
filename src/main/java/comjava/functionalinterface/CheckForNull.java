package comjava.functionalinterface;

import java.util.function.Predicate;

public class CheckForNull implements Predicate<Object> {
    @Override
    public boolean test(Object o) {
        return o != null;
    }
}
