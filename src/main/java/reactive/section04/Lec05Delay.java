package reactive.section04;

import java.time.Duration;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec05Delay {

    public static void main(String[] args) {
        Flux.range(1, 100).log().delayElements(Duration.ofSeconds(1))
                .subscribe(Utils.defaultSubscriber());
        Utils.sleep(10);
    }
}
