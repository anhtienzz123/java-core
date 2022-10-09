package comjava.structure.adapter;

public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        return String.format("%s-%s-%s", customer.getName(), customer.getDesignation(),
                customer.getAddress());
    }
}
