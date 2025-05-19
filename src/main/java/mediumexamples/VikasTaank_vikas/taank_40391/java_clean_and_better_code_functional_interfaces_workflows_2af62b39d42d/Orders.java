package mediumexamples.VikasTaank_vikas.taank_40391.java_clean_and_better_code_functional_interfaces_workflows_2af62b39d42d;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Orders {
	int orderId;
	String status;
    int amount;
    boolean isAvailable;
}
