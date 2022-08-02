package me.hero.myrefrigerator.exception;

public class InvalidParamException extends RuntimeException{
    public InvalidParamException() {
        super();
    }

    public InvalidParamException(String message) {
        super(message);
    }

    public InvalidParamException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParamException(Throwable cause) {
        super(cause);
    }

    protected InvalidParamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
