package designpattern.test.designpattern.behavioral.command.texteditor;

import java.util.Stack;

// Invoker
public class ToolBar {

	private Stack<Command> commandHistories = new Stack<>();

	public void executeCommand(Command command) {
		command.execute();
		this.commandHistories.push(command);
	}

	public void undo() {
		if (this.commandHistories.isEmpty()) {
			System.out.println("Nothing to undo");
			return;
		}

		Command command = commandHistories.pop();
		command.undo();
	}
}
