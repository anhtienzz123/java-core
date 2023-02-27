package reactive.section05;

import java.time.Duration;
import java.util.stream.Stream;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec03HotPublisher {

    public static void main(String[] args) {
        Flux<String> movieStream = Flux.fromStream(Lec03HotPublisher::getMovie)
                // share() = publish().refCount(1)
                .delayElements(Duration.ofSeconds(2)).publish().refCount(1);
        movieStream.subscribe(Utils.defaultSubscriber("sam"));
        Utils.sleepSeconds(5);
        movieStream.subscribe(Utils.defaultSubscriber("mike"));
        Utils.sleepSeconds(60);

        System.out.println("== Resubscribe");
        Flux<String> movieStream1 = Flux.fromStream(Lec03HotPublisher::getMovie)
                // share() = publish().refCount(1)
                .delayElements(Duration.ofSeconds(1)).publish().refCount(1);

        movieStream1.subscribe(Utils.defaultSubscriber("sam1"));
        Utils.sleepSeconds(7);
        movieStream1.subscribe(Utils.defaultSubscriber("mike1"));
        Utils.sleepSeconds(60);
    }

    private static Stream<String> getMovie() {
        System.out.println("Got the movie streaming req");
        return Stream.of("Scene 1", "Scene 2", "Scene 3", "Scene 4");
    }
}
