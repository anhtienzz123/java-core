package reactive.section04;

import lombok.Data;
import net.datafaker.Faker;

@Data
public class PurchaseOrder {

    private String item;
    private String price;
    private int userId;

    public PurchaseOrder(int userId) {
        this.userId = userId;
        this.item = new Faker().commerce().productName();
        this.price = new Faker().commerce().price();
    }
}
