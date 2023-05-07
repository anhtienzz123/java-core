package reactive.section06;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class Lec06Parallel {

    public static void main(String[] args) {
        Flux.range(1, 1000).parallel(10).runOn(Schedulers.parallel())
                .doOnNext(i -> printThreadName("next " + i))
                .subscribe(v -> printThreadName("sub " + v));
    }

    private static void printThreadName(String msg) {
        System.out.println(msg + "\t\t: Thread: " + Thread.currentThread().getName());
    }
}
