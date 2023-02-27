package reactive.section06;

import reactive.Utils;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class Lec03SubscribeOnMultipleSchedulers {

    public static void main(String[] args) {
        Flux<Object> flux = Flux.create(fluxSink -> {
            printThreadName("create");
            for (int i = 0; i < 4; i++) {
                fluxSink.next(i);
                Utils.sleepSeconds(1);
            }
            fluxSink.complete();
        }).doOnNext(i -> printThreadName("next " + i));

        flux.subscribeOn(Schedulers.boundedElastic()).subscribe(v -> printThreadName("sub " + v));

        flux.subscribeOn(Schedulers.parallel()).subscribe(v -> printThreadName("sub " + v));


        Utils.sleepSeconds(5);
    }

    private static void printThreadName(String msg) {
        System.out.println(msg + "\t\t: Thread: " + Thread.currentThread().getName());
    }
}
