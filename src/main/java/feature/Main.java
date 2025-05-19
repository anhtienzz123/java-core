package feature;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import lombok.Data;

public class Main {

	public static void main(String[] args) {
		testOptional();
	}

	private static void testOptional() {
		User user1 = new User(1, "user1");
		User user2 = new User(2, null);
		User user3 = null;

		Optional.ofNullable(user1).map(User::name).ifPresent(System.out::println);
		Optional.ofNullable(user2).map(User::name).ifPresent(System.out::println);
		Optional.ofNullable(user3).map(User::name).ifPresent(System.out::println);
	}
}

record User(int id, String name) {

}