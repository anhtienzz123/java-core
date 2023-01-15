package comjava.udemy.designpattern.behavioral.interpreter;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String username;

    private List<String> permissions;
}
