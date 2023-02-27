package reactive.section04;

import com.github.javafaker.Faker;
import lombok.Data;

@Data
public class PurchaseOrder {

    private String item;
    private String price;
    private int userId;

    public PurchaseOrder(int userId) {
        this.userId = userId;
        this.item = Faker.instance().commerce().productName();
        this.price = Faker.instance().commerce().price();
    }
}
