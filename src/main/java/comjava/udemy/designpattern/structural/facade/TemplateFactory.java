package comjava.udemy.designpattern.structural.facade;

public class TemplateFactory {

    public static Template createTemplateFor(TemplateType templateType) {
        return new Template();
    }
}
