package comjava.udemy.designpattern.behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        UIMediator uiMediator = new UIMediator();
        TextBox textBox = new TextBox(uiMediator);
        Label label = new Label(uiMediator);

        System.out.println("==== Textbox change");
        textBox.setControlValue("textbox value");

        System.out.println("==== Label change");
        label.setControlValue("label value");
    }
}
