package reactive.section04;

import java.util.function.Function;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec10Transform {

    public static void main(String[] args) {
        getPersons().transform(applyFilterMap()).subscribe(Utils.defaultSubscriber());
    }

    private static Flux<Person> getPersons() {
        return Flux.range(1, 10).map(i -> new Person());
    }

    private static Function<Flux<Person>, Flux<Person>> applyFilterMap() {
        return flux -> flux.filter(ele -> ele.getAge() > 10)
                .doOnNext(ele -> ele.setName(ele.getName().toUpperCase()))
                .doOnDiscard(Person.class, ele -> System.out.println("Discard: " + ele));
    }
}
