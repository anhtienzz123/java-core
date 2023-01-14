package comjava.udemy.designpattern.structural.flyweight;

import comjava.udemy.designpattern.structural.flyweight.ErrorMessageFactory.ErrorType;

public class Main {

    public static void main(String[] args) {
        SystemErrorMessage systemErrorMessage =
                ErrorMessageFactory.getInstance().getErrorMessage(ErrorType.SYSTEM_ERROR);
        System.out.println(systemErrorMessage.getText("500"));

        SystemErrorMessage notfoundErrorMessage =
                ErrorMessageFactory.getInstance().getErrorMessage(ErrorType.NOT_FOUND);
        System.out.println(notfoundErrorMessage.getText("404"));

        SystemErrorMessage badrequestErrorMessage =
                ErrorMessageFactory.getInstance().getErrorMessage(ErrorType.BAD_REQUEST);
        System.out.println(badrequestErrorMessage.getText("400"));
    }
}
