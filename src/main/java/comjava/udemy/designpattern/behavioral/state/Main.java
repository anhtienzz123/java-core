package comjava.udemy.designpattern.behavioral.state;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.cancel();
        order.paymentSuccessful();
        order.cancel();
        order.dispatched();
        order.cancel();
        order.delivered();
        order.cancel();
        order.cancel();
    }
}
