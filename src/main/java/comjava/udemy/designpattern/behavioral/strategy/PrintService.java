package comjava.udemy.designpattern.behavioral.strategy;

import java.util.LinkedList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrintService {

    private OrderPrinter printer;

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
