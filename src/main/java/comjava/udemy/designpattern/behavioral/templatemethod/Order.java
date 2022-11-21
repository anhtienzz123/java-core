package comjava.udemy.designpattern.behavioral.templatemethod;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int id;
    
    private LocalDate date;
    
    private Map<String, Double> items = new HashMap<>();
    
    private double total;
    
    public Order(int id) {
        this.id = id;
        date = LocalDate.now();
    }
}
