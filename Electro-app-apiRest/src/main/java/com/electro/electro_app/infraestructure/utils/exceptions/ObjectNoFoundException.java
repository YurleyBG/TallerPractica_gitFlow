package com.electro.electro_app.infraestructure.utils.exceptions;

public class ObjectNoFoundException extends RuntimeException {
    public ObjectNoFoundException(){

    }

    public ObjectNoFoundException(String message){
        super(message);
    }

    public ObjectNoFoundException(String message, Throwable cause){
        super(message,cause);
    }
}
