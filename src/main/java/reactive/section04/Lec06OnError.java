package reactive.section04;

import com.github.javafaker.Faker;
import reactive.Utils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Lec06OnError {

    public static void main(String[] args) {
        Flux.range(1, 100).log().map(i -> 10 / (5 - i))
                // .onErrorReturn(-1)
                .onErrorResume(e -> fallback())
                // .onErrorContinue((err, object) -> {
                //
                // })
                .subscribe(Utils.defaultSubscriber());
    }

    private static Mono<Integer> fallback() {
        return Mono.fromSupplier(() -> Faker.instance().random().nextInt(100, 200));
    }
}
