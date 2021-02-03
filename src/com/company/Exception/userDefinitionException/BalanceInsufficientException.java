package com.company.Exception.userDefinitionException;

public class BalanceInsufficientException extends Exception {
    public String message;
    public BalanceInsufficientException() {}
    public BalanceInsufficientException(String message) {
        this.message = message;
//        super(message);
    }

    @Override
    public String getMessage() {
        return "자식 " + message ;
    }
}
