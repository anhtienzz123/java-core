package comjava.udemy.designpattern.behavioral.mediator;

public interface UIControl {

    void controlChanged(UIControl uiControl);

    void setControlValue(String text);

    String getControlValue();

    String getControlName();
}
