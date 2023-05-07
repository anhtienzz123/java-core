package reactive.section07;

import reactive.Utils;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class Lec02Drop {

    public static void main(String[] args) {
        Flux.create(fluxSink -> {

            for (int i = 0; i < 501; i++) {
                fluxSink.next(i);
                System.out.println("Pushed: " + i);
            }
            fluxSink.complete();

        }).onBackpressureDrop().publishOn(Schedulers.boundedElastic()).doOnNext(i -> {
            Utils.sleepMillis(10);
        }).subscribe(Utils.defaultSubscriber());

        Utils.sleepSeconds(60);
    }

}
