package comjava.udemy.designpattern.behavioral.observer;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(1);
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();
        order.attach(priceObserver);
        order.attach(quantityObserver);

        order.addItem(10);
        System.out.println(order);
    }
}
