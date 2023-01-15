package comjava.udemy.designpattern.behavioral.mediator;

public class TextBox implements UIControl {

    private UIMediator uiMediator;

    private String controlValue;

    public TextBox(UIMediator uiMediator) {
        this.uiMediator = uiMediator;
        this.uiMediator.register(this);
    }

    @Override
    public void controlChanged(UIControl uiControl) {
        System.out.println("== " + getControlName());
        System.out.println("UIControl change: " + uiControl.getControlName());
    }

    @Override
    public void setControlValue(String text) {
        this.controlValue = text;
        uiMediator.valueChanged(this);
    }

    @Override
    public String getControlValue() {
        return controlValue;
    }

    @Override
    public String getControlName() {
        return "Text box";
    }
}
