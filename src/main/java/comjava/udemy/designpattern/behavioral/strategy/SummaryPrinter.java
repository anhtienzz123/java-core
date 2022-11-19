package comjava.udemy.designpattern.behavioral.strategy;

import java.util.Collection;

public class SummaryPrinter implements OrderPrinter {

    @Override
    public void print(Collection<Order> orders) {
        System.out.println("== Sumary printer");
        orders.forEach(System.out::println);
        System.out.println("== End sumary printer");
    }
}
