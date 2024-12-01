package com.eteration.simplebanking.model;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Insufficient balance");
    }
}
