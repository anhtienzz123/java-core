package reactive;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DefaultSubscriber<T> implements Subscriber<T> {

    private String name;

    @Override
    public void onSubscribe(Subscription s) {
        s.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(T t) {
        System.out.println(name + "-" + "onNext: " + t);
    }

    @Override
    public void onError(Throwable t) {
        System.out.println(name + "-" + "onError: " + t.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println(name + "-" + "onComplete");
    }
}
