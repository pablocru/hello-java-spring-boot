package com.pablocru.restcrud.springdatajpa.rest;

public class EmployeeErrorResponse {

    // ATTRIBUTES

    private int status;
    private String message;
    private long timeStamp;

    // CONSTRUCTORS

    public EmployeeErrorResponse() {
    };

    public EmployeeErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
        this.timeStamp = System.currentTimeMillis();
    }

    // METHODS

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp() {
        this.timeStamp = System.currentTimeMillis();
    }
}
