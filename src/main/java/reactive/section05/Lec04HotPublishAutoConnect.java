package reactive.section05;

import java.time.Duration;
import java.util.stream.Stream;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec04HotPublishAutoConnect {

    public static void main(String[] args) {

        Flux<String> movieStream = Flux.fromStream(Lec04HotPublishAutoConnect::getMovie)
                .delayElements(Duration.ofSeconds(1)).publish().autoConnect(1);

        movieStream.subscribe(Utils.defaultSubscriber("sam"));
        Utils.sleepSeconds(7);
        System.out.println("Mike is about to join");
        movieStream.subscribe(Utils.defaultSubscriber("mike"));
        Utils.sleepSeconds(60);
    }

    private static Stream<String> getMovie() {
        System.out.println("Got the movie streaming req");
        return Stream.of("Scene 1", "Scene 2", "Scene 3", "Scene 4");
    }
}
