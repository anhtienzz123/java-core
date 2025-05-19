package mediumexamples.VikasTaank_vikas.taank_40391.java_clean_and_better_code_functional_interfaces_workflows_2af62b39d42d;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class OrderProcessingWorkFlow {
	private static InventoryService inventoryService;

	public static void main(String[] args) {
		List<Function<Orders, Orders>> workflow = new ArrayList<>();

		// Step 1: Validate Order
		workflow.add(order -> {
			if (order.amount <= 0)
				throw new IllegalArgumentException("Invalid amount");
			return order;
		});

		// Step 2: Inventory Look Up
		workflow.add(order -> {
			if (inventoryService.isAvailable(order.orderId))
				order.isAvailable = true;
			return order;
		});
		// Step 2: Apply discount if the order is above $500
		workflow.add(order -> {
			if (order.amount > 500)
				order.amount *= 0.9;
			return order;
		});

		// Step 3: Mark Order as Processed
		workflow.add(order -> {
			order.status = "Processed";
			return order;
		});

		// Execute Pipeline
		Orders orders = new Orders(1001, "New", 600, true);
		for (Function<Orders, Orders> step : workflow) {
			orders = step.apply(orders);
		}

		System.out.println(orders); // Order{status='Processed', amount=540}
	}
}
