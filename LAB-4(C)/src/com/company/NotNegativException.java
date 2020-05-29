package com.company;

class NotNegativeException extends Exception {
    public NotNegativeException(){
        super();
    }
    public NotNegativeException(String message, Throwable exception){
        super(message,exception);
    }
    public NotNegativeException(String message){
        super(message);
    }
}
