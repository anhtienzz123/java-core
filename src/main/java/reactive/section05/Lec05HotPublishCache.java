package reactive.section05;

import java.time.Duration;
import java.util.stream.Stream;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec05HotPublishCache {

    public static void main(String[] args) {

        // cache() = publish().replay()
        Flux<String> movieStream = Flux.fromStream(Lec05HotPublishCache::getMovie)
                .delayElements(Duration.ofSeconds(2)).cache(2);

        Utils.sleepSeconds(2);
        movieStream.subscribe(Utils.defaultSubscriber("sam"));
        Utils.sleepSeconds(5);
        System.out.println("Mike is about to join");
        movieStream.subscribe(Utils.defaultSubscriber("mike"));
        Utils.sleepSeconds(60);
    }

    private static Stream<String> getMovie() {
        System.out.println("Got the movie streaming req");
        return Stream.of("Scene 1", "Scene 2", "Scene 3", "Scene 4");
    }
}
