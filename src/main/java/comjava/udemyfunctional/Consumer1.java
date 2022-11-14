package comjava.udemyfunctional;

import java.util.Objects;

@FunctionalInterface
public interface Consumer1<T> {

    void accept(T t);

    default Consumer1<T> thenAccept(Consumer1<T> consumer) {

        Objects.requireNonNull(consumer);


        return t -> {
            this.accept(t);
            consumer.accept(t);
        };
    }

    public static void main(String[] args) {

        Consumer1<String> consumer1 = t -> System.out.println("consumer1: " + t);
        Consumer1<String> consumer2 = t -> System.out.println("consumer2: " + t);
        Consumer1<String> consumer3 = t -> System.out.println("consumer3: " + t);

        Consumer1<String> consumer = consumer1.thenAccept(consumer2).thenAccept(consumer3);
        consumer.accept("test consumer");


    }
}
