package comjava.udemy.designpattern.behavioral.state;

public class New implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("new");
        return 0;
    }
}
