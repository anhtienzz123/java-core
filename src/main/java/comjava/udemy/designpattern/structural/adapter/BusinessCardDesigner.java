package comjava.udemy.designpattern.structural.adapter;

public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        StringBuilder stringBuilder = new StringBuilder("\n");
        stringBuilder.append(customer.getName()).append("\n").append(customer.getDesignation())
                .append("\n").append(customer.getAddress());

        return stringBuilder.toString();
    }
}
