package feature.record;

public class Main {

	public static void main(String[] args) {
		Person person = new Person(1, "name test");
		System.out.println(person); // Person[id=1, name=name test]
		System.out.println(Person.ID_DEFAULT); // 0
		System.out.println(Person.getPersonDefault()); // Person[id=0, name=Default]
	}
}
