package feature.record;

import java.util.Objects;

public record Person(Integer id, String name) {

	public static Integer ID_DEFAULT = 0;

	public Person {
		Objects.requireNonNull(id);
		Objects.requireNonNull(name);
	}

	public Person(Integer id) {
		this(id, null);
	}

	public static Person getPersonDefault() {
		return new Person(ID_DEFAULT, "Default");
	}
}
