package comjava.udemy.designpattern.behavioral.templatemethod;

public class TextPrinter extends OrderPrinter {

    @Override
    protected void start() {
        System.out.println("start text printer");
    }

    @Override
    protected void printId(Order order) {
        System.out.println("id: " + order.getId());
    }

    @Override
    protected void printDate(Order order) {
        System.out.println("date: " + order.getDate());
    }

    @Override
    protected void printItems(Order order) {
        System.out.println("items: " + order.getItems());
    }

    @Override
    protected void printTotal(Order order) {
        System.out.println("total: " + order.getTotal());
    }

    @Override
    protected void end() {
        System.out.println("end text printer");
    }
}
