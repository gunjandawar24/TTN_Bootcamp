package com.example.RestfulWebService.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Ques6 - class for throwing custom exception
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmpNotFoundException extends RuntimeException {
    public EmpNotFoundException(String message) {
        super(message);
    }
}