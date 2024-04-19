package org.example.microservices.transactionalexample.exception;

public class InsufficientAmountException extends RuntimeException{
    public InsufficientAmountException(String message){
        super(message);
    }
}
