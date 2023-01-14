package comjava.udemy.designpattern.structural.flyweight;

import java.util.HashMap;

public class ErrorMessageFactory {

    private static final ErrorMessageFactory INSTANCE = new ErrorMessageFactory();

    private HashMap<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {
        errorMessages.put(ErrorType.SYSTEM_ERROR, new SystemErrorMessage("System error: $code"));
        errorMessages.put(ErrorType.NOT_FOUND, new SystemErrorMessage("Not found: $code"));
        errorMessages.put(ErrorType.BAD_REQUEST, new SystemErrorMessage("Bad request: $code"));

    }

    public static ErrorMessageFactory getInstance() {
        return INSTANCE;
    }

    public SystemErrorMessage getErrorMessage(ErrorType errorType) {
        return errorMessages.get(errorType);
    }

    public enum ErrorType {
        SYSTEM_ERROR, NOT_FOUND, BAD_REQUEST
    }
}
