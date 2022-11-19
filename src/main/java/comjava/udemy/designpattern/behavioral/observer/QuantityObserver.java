package comjava.udemy.designpattern.behavioral.observer;

public class QuantityObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        int count = order.getCount();
        if (count <= 5) {
            order.setShippingCost(50);
        }
    }
}
