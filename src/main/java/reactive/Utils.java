package reactive;

import java.util.function.Consumer;
import reactive.section03.NameProducer;

public class Utils {

    public static void sleepSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sleepMillis(int millis) {
        try {
            Thread.sleep(millis);
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
        return new DefaultSubscriber<Object>("subscriber");
    }

    public static DefaultSubscriber<Object> defaultSubscriber(String name) {
        return new DefaultSubscriber<Object>(name);
    }

    public static NameProducer nameProducer() {
        return new NameProducer();
    }
}
