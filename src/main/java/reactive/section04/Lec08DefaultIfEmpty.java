package reactive.section04;

import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec08DefaultIfEmpty {

    public static void main(String[] args) {
        getOderNumbers().filter(i -> i > 10).defaultIfEmpty(0).subscribe(Utils.defaultSubscriber());
    }

    private static Flux<Integer> getOderNumbers() {
        return Flux.range(1, 10);
    }
}
