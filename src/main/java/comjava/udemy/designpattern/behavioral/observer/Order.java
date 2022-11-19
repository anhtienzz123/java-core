package comjava.udemy.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int id;

    private double itemCost;

    private int count;

    private double discount;

    private double shippingCost;

    private List<OrderObserver> observers = new ArrayList<>();

    public void attach(OrderObserver orderObserver) {
        observers.add(orderObserver);
    }

    public void detach(OrderObserver orderObserver) {
        observers.remove(orderObserver);
    }

    public Order(int id) {
        this.id = id;
    }


    public void addItem(double price) {
        itemCost += price;
        count++;
        observers.forEach(ele -> ele.updated(this));
    }

    public double getTotal() {
        return itemCost - discount + shippingCost;
    }
}
