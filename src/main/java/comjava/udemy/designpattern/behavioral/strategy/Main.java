package comjava.udemy.designpattern.behavioral.strategy;

import java.util.LinkedList;

public class Main {

    private static LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
        createOrders();


        PrintService printService = new PrintService(new SummaryPrinter());
        printService.printOrders(orders);

    }

    private static void createOrders() {
        Order order1 = new Order(1);
        order1.getItems().put("Soda", 10.0);
        order1.getItems().put("Chips", 20.0);
        orders.add(order1);

        Order order2 = new Order(2);
        order2.getItems().put("Cake", 30.0);
        order2.getItems().put("Cookies", 40.0);
        orders.add(order2);
    }
}
