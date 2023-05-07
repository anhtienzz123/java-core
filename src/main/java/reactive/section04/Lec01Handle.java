package reactive.section04;

import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec01Handle {

    public static void main(String[] args) {
        Flux.range(0, 10).handle((interger, syncSink) -> {
            if (interger % 2 == 0) {
                syncSink.next(interger);
            }
        }).subscribe(Utils.defaultSubscriber());


    }
}
