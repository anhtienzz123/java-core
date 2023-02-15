package reactive.section04;

import java.time.Duration;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec07Timeout {

    public static void main(String[] args) {
        getOderNumbers().timeout(Duration.ofSeconds(2), fallback())
                .subscribe(Utils.defaultSubscriber());

        Utils.sleep(10);
    }

    private static Flux<Integer> getOderNumbers() {
        return Flux.range(1, 100).delayElements(Duration.ofSeconds(2));
    }

    private static Flux<Integer> fallback() {
        return Flux.range(100, 200).delayElements(Duration.ofSeconds(1));
    }
}
