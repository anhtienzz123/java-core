package comjava.udemy.designpattern.behavioral.state;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    private OrderState currentState;

    public Order() {
        currentState = new New();
    }

    public double cancel() {
        double charges = currentState.handleCancellation();
        this.currentState = new Cancelled();
        return charges;
    }

    public void paymentSuccessful() {
        this.currentState = new Paid();
    }

    public void dispatched() {
        this.currentState = new Intransit();
    }

    public void delivered() {
        this.currentState = new Delivered();
    }
}
