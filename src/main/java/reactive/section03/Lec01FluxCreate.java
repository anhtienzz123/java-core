package reactive.section03;

import com.github.javafaker.Faker;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec01FluxCreate {

    public static void main(String[] args) {
        Flux.create(fluxSink -> {
            for (int i = 0; i < 10; i++) {
                String country = Faker.instance().country().name();
                fluxSink.next(country);
            }
        }).subscribe(Utils.defaultSubscriber());
    }
}
