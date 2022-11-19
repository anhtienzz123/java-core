package comjava.udemy.designpattern.behavioral.state;

public class Paid implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("paid");
        return 10;
    }
}
