package reactive.section03;

import net.datafaker.Faker;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec05FluxGenerate {

    public static void main(String[] args) {
        Flux.generate(synsSink -> {
            String country = new Faker().country().name();
            System.out.println("emit: " + country);
            synsSink.next(country);
            synsSink.complete();
        }).take(3).subscribe(Utils.defaultSubscriber());
    }
}
