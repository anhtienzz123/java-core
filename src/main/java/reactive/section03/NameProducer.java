package reactive.section03;

import java.util.function.Consumer;

import net.datafaker.Faker;
import reactor.core.publisher.FluxSink;

public class NameProducer implements Consumer<FluxSink<String>> {

    private FluxSink<String> fluxSink;

    @Override
    public void accept(FluxSink<String> t) {
        this.fluxSink = t;
    }

    public void producer() {
        String country = new Faker().country().name();
        this.fluxSink.next(country);
    }
}
