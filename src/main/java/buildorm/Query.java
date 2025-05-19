package buildorm;

import java.util.List;
import java.util.function.Predicate;

public class Query<T> {
	private final List<T> source;
	private Predicate<T> predicate;

	private Query(List<T> source) {
		this.source = source;
	}

	public static <T> Query<T> from(List<T> source) {
		return new Query<>(source);
	}

	public Query<T> where(Predicate<T> predicate) {
		this.predicate = predicate;
		return this;
	}

	public List<T> fetch() {
		if (predicate == null)
			return source;
		return source.stream().filter(predicate::test).toList();
	}
}
