package reactive.section03;

import net.datafaker.Faker;
import reactive.Utils;
import reactor.core.publisher.Flux;

public class Lec04FluxCreateIssueFix {

	public static void main(String[] args) {
		Flux.create(fluxSink -> {
			for (int i = 0; i < 10; i++) {
				if (fluxSink.isCancelled()) {
					break;
				}

				String country = new Faker().country().name();
				System.out.println("emit: " + country);
				fluxSink.next(country);
			}
			fluxSink.complete();

		}).take(3).subscribe(Utils.defaultSubscriber());
	}
}
