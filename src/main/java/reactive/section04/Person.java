package reactive.section04;

import com.github.javafaker.Faker;
import lombok.Data;

@Data
public class Person {

    private String name;
    private int age;

    public Person() {
        this.name = Faker.instance().name().fullName();
        this.age = Faker.instance().random().nextInt(1, 20);
    }
}
