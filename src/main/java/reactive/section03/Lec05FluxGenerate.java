package reactive.section03;

import com.github.javafaker.Faker;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec05FluxGenerate {

    public static void main(String[] args) {
        Flux.generate(synsSink -> {
            String country = Faker.instance().country().name();
            System.out.println("emit: " + country);
            synsSink.next(country);
            synsSink.complete();
        }).take(3).subscribe(Utils.defaultSubscriber());
    }
}
