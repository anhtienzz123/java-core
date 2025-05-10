package reactive.section03;

import net.datafaker.Faker;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec07FluxGenerateCounter {

    public static void main(String[] args) {
        Flux.generate(() -> 1, (counter, synsSink) -> {
            String country = new Faker().country().name();
            synsSink.next(country);

            if (country.equals("Viet Nam") || counter >= 10) {
                synsSink.complete();
            }

            return counter + 1;
        }).subscribe(Utils.defaultSubscriber());
    }
}
