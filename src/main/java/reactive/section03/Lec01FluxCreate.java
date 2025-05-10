package reactive.section03;

import net.datafaker.Faker;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec01FluxCreate {

    public static void main(String[] args) {
        Flux.create(fluxSink -> {
            for (int i = 0; i < 10; i++) {
                String country = new Faker().country().name();
                fluxSink.next(country);
            }
        }).subscribe(Utils.defaultSubscriber());
    }
}
