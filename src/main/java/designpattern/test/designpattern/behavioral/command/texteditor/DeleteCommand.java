package designpattern.test.designpattern.behavioral.command.texteditor;

public class DeleteCommand implements Command {

	private TextEditor textEditor;
	private char deletedCharacter = '\0';

	public DeleteCommand(TextEditor textEditor) {
		this.textEditor = textEditor;
	}

	@Override
	public void execute() {
		int lenght = textEditor.getText().length();
		if (lenght != 0) {
			this.deletedCharacter = textEditor.getText().charAt(lenght - 1);
			textEditor.delete();
		} else {
			System.out.println("Nothing to delete");
		}
	}

	@Override
	public void undo() {
		if (this.deletedCharacter == '\0') {
			return;
		}

		textEditor.type(deletedCharacter);
	}

}
