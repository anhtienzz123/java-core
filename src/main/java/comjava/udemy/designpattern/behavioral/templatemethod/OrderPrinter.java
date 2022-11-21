package comjava.udemy.designpattern.behavioral.templatemethod;

public abstract class OrderPrinter {

    public final void printOrder(Order order) {
        System.out.println("== start print");
        start();
        printId(order);
        printDate(order);
        printItems(order);
        printTotal(order);
        System.out.println("== end print");
    }
    
    protected abstract void start();
    
    protected abstract void printId(Order order);
    
    protected abstract void printDate(Order order);
    
    protected abstract void printItems(Order order);
    
    protected abstract void printTotal(Order order);
    
    protected abstract void end();
}
