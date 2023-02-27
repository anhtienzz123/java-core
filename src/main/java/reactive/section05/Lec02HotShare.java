package reactive.section05;

import java.time.Duration;
import java.util.stream.Stream;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec02HotShare {

    public static void main(String[] args) {
        Flux<String> movieStream = Flux.fromStream(Lec02HotShare::getMovie)
                .delayElements(Duration.ofSeconds(2)).share();

        movieStream.subscribe(Utils.defaultSubscriber("sam"));
        Utils.sleepSeconds(5);
        movieStream.subscribe(Utils.defaultSubscriber("mike"));
        Utils.sleepSeconds(60);
    }

    private static Stream<String> getMovie() {
        System.out.println("Got the movie streaming req");
        return Stream.of("Scene 1", "Scene 2", "Scene 3", "Scene 4");
    }
}
