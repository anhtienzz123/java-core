package buildorm;

import java.util.function.Function;
import java.util.function.Predicate;

public class StringPath<T> {
	private final Function<T, String> getter;

	public StringPath(Function<T, String> getter) {
		this.getter = getter;
	}

	public Predicate<T> eq(String value) {
		return t -> getter.apply(t).equals(value);
	}

	public Predicate<T> contains(String value) {
		return t -> getter.apply(t).contains(value);
	}
}
