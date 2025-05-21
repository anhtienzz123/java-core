package designpattern.test.designpattern.behavioral.command.texteditor;

public class Main {

	public static void main(String[] args) {
		// Receiver
		TextEditor textEditor = new TextEditor();
		
		// Invoker
		
		// Command
		Command typeA = new TypeCommand(textEditor, 'A');
		Command typeB = new TypeCommand(textEditor, 'B');
		Command delete = new DeleteCommand(textEditor);
		
		// Execute
		ToolBar toolBar = new ToolBar();
		toolBar.executeCommand(typeA);
		toolBar.executeCommand(typeB);
		toolBar.executeCommand(delete);
		toolBar.executeCommand(delete);
		toolBar.executeCommand(delete);
		
		// Undo
		System.out.println("-- Undo");
		toolBar.undo();
		toolBar.undo();
		toolBar.undo();
		toolBar.undo();
	}
}
