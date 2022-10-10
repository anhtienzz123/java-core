package comjava.functionalinterface;

import java.util.function.Consumer;

public class LongConsumer implements Consumer<Long>{

    @Override
    public void accept(Long t) {
        System.out.println("consumer: " + t);
    }
}
