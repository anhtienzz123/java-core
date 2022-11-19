package comjava.udemy.designpattern.behavioral.state;

public class Intransit implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("intransit");
        return 20;
    }
}
