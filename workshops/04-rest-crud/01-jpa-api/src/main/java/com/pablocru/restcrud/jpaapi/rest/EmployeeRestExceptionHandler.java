package com.pablocru.restcrud.jpaapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.pablocru.restcrud.jpaapi.service.EmployeeNotFoundException;

@ControllerAdvice
public class EmployeeRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(
            EmployeeNotFoundException exception) {

        EmployeeErrorResponse error = new EmployeeErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                exception.getMessage());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(Exception exception) {

        EmployeeErrorResponse error = new EmployeeErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                exception.getMessage());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

    }

}
