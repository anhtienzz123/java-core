package reactive.section04;

import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec04LimitRate {

    public static void main(String[] args) {
        Flux.range(1, 1000).log().limitRate(50).subscribe(Utils.defaultSubscriber());
    }
}
