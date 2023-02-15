package reactive.section03;

import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec08FluxPush {

    public static void main(String[] args) {
        NameProducer nameProducer = Utils.nameProducer();
        Flux.push(nameProducer).subscribe(Utils.defaultSubscriber());
        nameProducer.producer();

        Runnable task = nameProducer::producer;

        for (int i = 0; i < 10; i++) {
            new Thread(task).start();
        }

        Utils.sleep(10);
    }
}
