package designpattern.test.designpattern.behavioral.command.texteditor;

public class TypeCommand implements Command {

	private TextEditor textEditor;
	private char character;

	public TypeCommand(TextEditor textEditor, char character) {
		this.textEditor = textEditor;
		this.character = character;
	}

	@Override
	public void execute() {
		this.textEditor.type(character);
	}

	@Override
	public void undo() {
		this.textEditor.delete();
	}
}
