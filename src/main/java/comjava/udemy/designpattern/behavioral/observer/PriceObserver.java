package comjava.udemy.designpattern.behavioral.observer;

public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double total = order.getItemCost();
        if (total > 100) {
            order.setDiscount(10);
        }
    }
}
