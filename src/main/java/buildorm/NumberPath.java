package buildorm;

import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPath<T> {
	private final Function<T, Integer> getter;

	public NumberPath(Function<T, Integer> getter) {
		this.getter = getter;
	}

	public Predicate<T> eq(int value) {
		return t -> getter.apply(t) == value;
	}

	public Predicate<T> gt(int value) {
		return t -> getter.apply(t) > value;
	}

	public Predicate<T> lt(int value) {
		return t -> getter.apply(t) < value;
	}
}
