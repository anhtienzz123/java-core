package reactive.section04;

import net.datafaker.Faker;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec02HandleAssignment {

    public static void main(String[] args) {
        Flux.generate(syncSink -> syncSink.next(new Faker().country().name()))
                .map(Object::toString).handle((s, syncSink) -> {
                    syncSink.next(s);
                    if (s.equals("Viet Nam")) {
                        syncSink.complete();
                    }
                }).subscribe(Utils.defaultSubscriber());
    }
}
