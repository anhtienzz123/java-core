package reactive.section04;

import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec09SwitchIfEmpty {

    public static void main(String[] args) {
        getOderNumbers().filter(i -> i > 10).switchIfEmpty(fallback())
                .subscribe(Utils.defaultSubscriber());

        Utils.sleepSeconds(5);
    }

    private static Flux<Integer> getOderNumbers() {
        return Flux.range(1, 10);
    }

    private static Flux<Integer> fallback() {
        return Flux.range(100, 5);
    }
}
