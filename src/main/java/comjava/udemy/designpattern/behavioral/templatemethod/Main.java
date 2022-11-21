package comjava.udemy.designpattern.behavioral.templatemethod;

import java.time.LocalDate;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Order order =
                new Order(1, LocalDate.now(), Collections.singletonMap("laptop", 100.0), 100);
        OrderPrinter orderPrinter = new TextPrinter();
        orderPrinter.printOrder(order);
    }
}
