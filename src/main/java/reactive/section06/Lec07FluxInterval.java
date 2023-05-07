package reactive.section06;

import java.time.Duration;
import reactive.Utils;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class Lec07FluxInterval {

    public static void main(String[] args) {
        Flux.interval(Duration.ofSeconds(1)).subscribeOn(Schedulers.boundedElastic())
                .subscribe(Utils.defaultSubscriber());

        Utils.sleepSeconds(10);
    }


}
