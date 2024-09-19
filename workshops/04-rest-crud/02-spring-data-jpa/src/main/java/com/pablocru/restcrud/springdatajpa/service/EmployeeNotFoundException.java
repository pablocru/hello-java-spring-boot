package com.pablocru.restcrud.springdatajpa.service;

public class EmployeeNotFoundException extends RuntimeException {

    // CONSTRUCTORS

    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public EmployeeNotFoundException(int theId) {
        super("Employee id not found - " + theId);
    }

    public EmployeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeNotFoundException(Throwable cause) {
        super(cause);
    }

}
