package comjava.udemy.designpattern.behavioral.interpreter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {

    private String name;

    // "NOT ADMIN", "FINANCE_USER AND ADMIN"
    private String permission;
}
