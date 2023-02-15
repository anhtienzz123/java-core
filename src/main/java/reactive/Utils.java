package reactive;

import java.util.function.Consumer;
import reactive.section03.NameProducer;

public class Utils {

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Consumer<Object> onNext() {
        return o -> System.out.println("onNext: " + o);
    }

    public static Consumer<Throwable> onError() {
        return e -> System.out.println("onError: " + e.getMessage());
    }

    public static Runnable onComplete() {
        return () -> System.out.println("onComplete: ");
    }

    public static DefaultSubscriber<Object> defaultSubscriber() {
        return new DefaultSubscriber<Object>("subscriber1");
    }

    public static NameProducer nameProducer() {
        return new NameProducer();
    }
}
