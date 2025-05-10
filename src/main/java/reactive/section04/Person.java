package reactive.section04;

import lombok.Data;
import net.datafaker.Faker;

@Data
public class Person {

    private String name;
    private int age;

    public Person() {
        this.name = new Faker().name().fullName();
        this.age = new Faker().random().nextInt(1, 20);
    }
}
