package comjava.udemy.designpattern.behavioral.state;

public class Delivered implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("delivered");
        return 30;
    }


}
